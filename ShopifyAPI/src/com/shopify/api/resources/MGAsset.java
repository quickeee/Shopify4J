/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in Asset.java
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

public class MGAsset extends ShopifyResource {

	@JsonProperty("public_url")
	public String getPublicUrl() {
		return (String)getAttribute("public_url");
	}
	@JsonProperty("public_url")
	public void setPublicUrl(String _public_url) {
		setAttribute("public_url", _public_url);
	}

	@JsonProperty("value")
	public String getValue() {
		return (String)getAttribute("value");
	}
	@JsonProperty("value")
	public void setValue(String _value) {
		setAttribute("value", _value);
	}

	@JsonProperty("key")
	public String getKey() {
		return (String)getAttribute("key");
	}
	@JsonProperty("key")
	public void setKey(String _key) {
		setAttribute("key", _key);
	}

}
