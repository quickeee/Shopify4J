/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in CustomerGroup.java
 *
 * It has been machine generated from fixtures and your changes will be
 * lost if anything new needs to be added to the API.
 **/
// Last Generated: 2011-09-20T09:56:16-04:00
package com.shopify.api.resources;

import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This code has been machine generated by processing the single entry
 * fixtures found from the Shopify API Documentation
 */

public class MGCustomerGroup extends ShopifyResource {

	@JsonProperty("name")
	public String getName() {
		return (String)getAttribute("name");
	}
	@JsonProperty("name")
	public void setName(String _name) {
		setAttribute("name", _name);
	}

	@JsonProperty("query")
	public String getQuery() {
		return (String)getAttribute("query");
	}
	@JsonProperty("query")
	public void setQuery(String _query) {
		setAttribute("query", _query);
	}

}
