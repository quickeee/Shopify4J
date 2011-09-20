/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in ProductVariant.java
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

public class MGProductVariant extends ShopifyResource {

	@JsonProperty("position")
	public int getPosition() {
		Integer value = (Integer)getAttribute("position");
		return value != null ? value : 0;
	}
	@JsonProperty("position")
	public void setPosition(int _position) {
		setAttribute("position", _position);
	}

	@JsonProperty("price")
	public String getPrice() {
		return (String)getAttribute("price");
	}
	@JsonProperty("price")
	public void setPrice(String _price) {
		setAttribute("price", _price);
	}

	@JsonProperty("requires_shipping")
	public boolean getRequiresShipping() {
		Boolean value = (Boolean)getAttribute("requires_shipping");
		return value != null ? value : false;
	}
	@JsonProperty("requires_shipping")
	public void setRequiresShipping(boolean _requires_shipping) {
		setAttribute("requires_shipping", _requires_shipping);
	}

	@JsonProperty("title")
	public String getTitle() {
		return (String)getAttribute("title");
	}
	@JsonProperty("title")
	public void setTitle(String _title) {
		setAttribute("title", _title);
	}

	@JsonProperty("compare_at_price")
	public String getCompareAtPrice() {
		return (String)getAttribute("compare_at_price");
	}
	@JsonProperty("compare_at_price")
	public void setCompareAtPrice(String _compare_at_price) {
		setAttribute("compare_at_price", _compare_at_price);
	}

	@JsonProperty("inventory_policy")
	public String getInventoryPolicy() {
		return (String)getAttribute("inventory_policy");
	}
	@JsonProperty("inventory_policy")
	public void setInventoryPolicy(String _inventory_policy) {
		setAttribute("inventory_policy", _inventory_policy);
	}

	@JsonProperty("inventory_quantity")
	public int getInventoryQuantity() {
		Integer value = (Integer)getAttribute("inventory_quantity");
		return value != null ? value : 0;
	}
	@JsonProperty("inventory_quantity")
	public void setInventoryQuantity(int _inventory_quantity) {
		setAttribute("inventory_quantity", _inventory_quantity);
	}

	@JsonProperty("inventory_management")
	public String getInventoryManagement() {
		return (String)getAttribute("inventory_management");
	}
	@JsonProperty("inventory_management")
	public void setInventoryManagement(String _inventory_management) {
		setAttribute("inventory_management", _inventory_management);
	}

	@JsonProperty("taxable")
	public boolean getTaxable() {
		Boolean value = (Boolean)getAttribute("taxable");
		return value != null ? value : false;
	}
	@JsonProperty("taxable")
	public void setTaxable(boolean _taxable) {
		setAttribute("taxable", _taxable);
	}

	@JsonProperty("grams")
	public int getGrams() {
		Integer value = (Integer)getAttribute("grams");
		return value != null ? value : 0;
	}
	@JsonProperty("grams")
	public void setGrams(int _grams) {
		setAttribute("grams", _grams);
	}

	@JsonProperty("sku")
	public String getSku() {
		return (String)getAttribute("sku");
	}
	@JsonProperty("sku")
	public void setSku(String _sku) {
		setAttribute("sku", _sku);
	}

	@JsonProperty("option1")
	public String getOption1() {
		return (String)getAttribute("option1");
	}
	@JsonProperty("option1")
	public void setOption1(String _option1) {
		setAttribute("option1", _option1);
	}

	@JsonProperty("fulfillment_service")
	public String getFulfillmentService() {
		return (String)getAttribute("fulfillment_service");
	}
	@JsonProperty("fulfillment_service")
	public void setFulfillmentService(String _fulfillment_service) {
		setAttribute("fulfillment_service", _fulfillment_service);
	}

	@JsonProperty("option2")
	public String getOption2() {
		return (String)getAttribute("option2");
	}
	@JsonProperty("option2")
	public void setOption2(String _option2) {
		setAttribute("option2", _option2);
	}

	@JsonProperty("option3")
	public String getOption3() {
		return (String)getAttribute("option3");
	}
	@JsonProperty("option3")
	public void setOption3(String _option3) {
		setAttribute("option3", _option3);
	}

}
