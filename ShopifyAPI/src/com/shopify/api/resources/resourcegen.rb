=begin
Current this will scrape through the fixtures and generate new class
implementations based on the training data.

It would be cool if we took a MOGenerator approach and created intermediate classes
say... _YourResource and overwrote those every time.

Then we could generate YourResource classes only if the file doesn't exist.

This means we could make super awesome changes to the API and run the code generator
and not completely hose all of our custom model code.
=end

require 'rubygems'
require 'active_support/all'
require 'json'
require 'date'

resources_location = "../../../../../../ShopifyAPITests/assets/fixtures"

@package = "com.shopify.api"

@resources = Dir.entries(resources_location).reject do |name|
  ["..", "."].include? name or
    not File.directory? "#{resources_location}/#{name}" or
    File.exists? "#{resources_location}/#{name}/skip"
end

@subresources = []

def determine_type(name, value)
  if value.class == Hash
    name = name.camelize
    if not @resources.include?(name) || @subresources.include?(name)
      @subresources <<= name
      generate_resource name, value
    end
    return name
  elsif value.class == Array
    return "List<#{determine_type(name.singularize, value.first)}>"
  elsif value.class == Fixnum
    return "int"
  elsif value.class == Float
    return "double"
  elsif value.class == TrueClass || value.class == FalseClass
    return "boolean"
  else
    return "String"
  end
end

def get_box_type(type)
  case type
  when 'int' then ['Integer', '0']
  when 'double' then ['Double', '0.0']
  when 'boolean' then ['Boolean', 'false']
  else [nil, nil]
  end
end

def generate_service(className, mainPackage, file)
  pluralized = className.pluralize;
  content =<<END
/**
*
*
**/
// Generated On: #{DateTime.now.to_s}
package #{mainPackage}.endpoints;

import java.util.List;

import org.codegist.crest.annotate.ContextPath;
import org.codegist.crest.annotate.Destination;
import org.codegist.crest.annotate.EndPoint;
import org.codegist.crest.annotate.HttpMethod;
import org.codegist.crest.annotate.Name;
import org.codegist.crest.annotate.ResponseHandler;
import org.codegist.crest.annotate.Path;

import static org.codegist.crest.HttpMethod.POST;
import static org.codegist.crest.HttpMethod.PUT;
import static org.codegist.crest.HttpMethod.DELETE;
import static org.codegist.crest.config.Destination.BODY;

import #{mainPackage}.resources.#{className};

@EndPoint("")
@ContextPath("/admin/#{pluralized.camelize(:lower)}")
@ResponseHandler(ShopifyResponseHandler.class)
public interface #{pluralized}Service extends BaseShopifyService {

    // GET
    @Path(".json")
    List<#{className}> get#{pluralized}();

    @Path(".json?{0}")
    List<#{className}> get#{pluralized}(String queryParams);

    @Path("/{0}.json")
    #{className} get#{className}(int id);

    @Path("/{0}.json?{1}")
    #{className} get#{className}(int id, String queryParams);

    @Path("/count.json")
    int getCount();

    @Path("/count.json?{0}")
    int getCount(String queryParams);

    // POST
    @Path(".json")
    @HttpMethod(POST)
    #{className} create#{className}(@Destination(BODY) @Name("#{className.underscore}") #{className} #{className.downcase});

    // PUT
    @Path("/{0}.json")
    @HttpMethod(PUT)
    #{className} update#{className}(int id, @Destination(BODY) @Name("#{className.underscore}") #{className} #{className.downcase});

    // DELETE
    @Path("/{0}.json")
    @HttpMethod(DELETE)
    void delete#{className}(int id);
}
END
  file.write(content)
end

def generate_java(className, superClass, hash, file)
  warning =<<END
/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in #{className[/MG([a-zA-Z0-9|_]+)/, 1]}.java
 *
 * It has been machine generated from fixtures and your changes will be
 * lost if anything new needs to be added to the API.
 **/
END
  header =<<END
// Last Generated: #{DateTime.now.to_s}
package com.shopify.api.resources;

import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This code has been machine generated by processing the single entry
 * fixtures found from the Shopify API Documentation
 */

public class #{className} extends #{superClass} {

END
  file.write(warning) if className[0,2] == "MG"
  file.write(header)
  hash.each{|resource_name, value|
    next if ["id", "created_at", "updated_at"].include? resource_name
    function_name = resource_name.camelize
    type = determine_type(resource_name, value)
    boxtype, default_value = get_box_type(type)
    # Prefix all names in case they use reserved keywords in the language
    #
    file.write "\t@JsonProperty(\"#{resource_name}\")\n"
    file.write "\tpublic #{type} get#{function_name}() {\n"
    if boxtype
      file.write "\t\t#{boxtype} value = (#{boxtype})getAttribute(\"#{resource_name}\");\n"
      file.write "\t\treturn value != null ? value : #{default_value};\n"
    else
      file.write "\t\treturn (#{type})getAttribute(\"#{resource_name}\");\n"
    end
    file.write "\t}\n"
    file.write "\t@JsonProperty(\"#{resource_name}\")\n"
    file.write "\tpublic void set#{function_name}(#{type} _#{resource_name}) {\n"
    file.write "\t\tsetAttribute(\"#{resource_name}\", _#{resource_name});\n"
    file.write "\t}\n"
    file.write "\n"
  }
  file.write("}\n")
end

def generate_resource(name, data)
  gen_file = "MG#{name}"
  output = File.open("#{gen_file}.java", 'wb')
  puts "Writing #{gen_file}.java to disk"
  generate_java(gen_file, "ShopifyResource", data, output)
  output.flush()
  output.close()
  unless File.exists? "#{name}.java"
    File.open("#{name}.java", "wb") do |f|
      generate_java(name, gen_file, {}, f)
    end
  end
end

@resources.each do |fixture_name|
  begin
    input = File.open("#{resources_location}/#{fixture_name}/single#{fixture_name}.json", 'rb')
    data = JSON.parse(input.read())
    input.close()
    data = data[data.keys.first]
    generate_resource fixture_name, data
    unless File.exists? "../endpoints/#{fixture_name.pluralize}Service.java"
      File.open("../endpoints/#{fixture_name.pluralize}Service.java", 'wb') do |f|
        generate_service fixture_name, @package, f
      end
    end
  rescue JSON::ParserError => err
    puts "ERROR: Could not write #{fixture_name}.java to disk.  Could the JSON be missing?"
    puts "REASON: #{err}"
    next
  end
end
