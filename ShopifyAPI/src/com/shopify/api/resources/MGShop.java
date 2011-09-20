/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in Shop.java
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

public class MGShop extends ShopifyResource {

	@JsonProperty("address1")
	public String getAddress1() {
		return (String)getAttribute("address1");
	}
	@JsonProperty("address1")
	public void setAddress1(String _address1) {
		setAttribute("address1", _address1);
	}

	@JsonProperty("city")
	public String getCity() {
		return (String)getAttribute("city");
	}
	@JsonProperty("city")
	public void setCity(String _city) {
		setAttribute("city", _city);
	}

	@JsonProperty("name")
	public String getName() {
		return (String)getAttribute("name");
	}
	@JsonProperty("name")
	public void setName(String _name) {
		setAttribute("name", _name);
	}

	@JsonProperty("shop_owner")
	public String getShopOwner() {
		return (String)getAttribute("shop_owner");
	}
	@JsonProperty("shop_owner")
	public void setShopOwner(String _shop_owner) {
		setAttribute("shop_owner", _shop_owner);
	}

	@JsonProperty("zip")
	public String getZip() {
		return (String)getAttribute("zip");
	}
	@JsonProperty("zip")
	public void setZip(String _zip) {
		setAttribute("zip", _zip);
	}

	@JsonProperty("plan_name")
	public String getPlanName() {
		return (String)getAttribute("plan_name");
	}
	@JsonProperty("plan_name")
	public void setPlanName(String _plan_name) {
		setAttribute("plan_name", _plan_name);
	}

	@JsonProperty("money_format")
	public String getMoneyFormat() {
		return (String)getAttribute("money_format");
	}
	@JsonProperty("money_format")
	public void setMoneyFormat(String _money_format) {
		setAttribute("money_format", _money_format);
	}

	@JsonProperty("money_with_currency_format")
	public String getMoneyWithCurrencyFormat() {
		return (String)getAttribute("money_with_currency_format");
	}
	@JsonProperty("money_with_currency_format")
	public void setMoneyWithCurrencyFormat(String _money_with_currency_format) {
		setAttribute("money_with_currency_format", _money_with_currency_format);
	}

	@JsonProperty("country")
	public String getCountry() {
		return (String)getAttribute("country");
	}
	@JsonProperty("country")
	public void setCountry(String _country) {
		setAttribute("country", _country);
	}

	@JsonProperty("public")
	public boolean getPublic() {
		Boolean value = (Boolean)getAttribute("public");
		return value != null ? value : false;
	}
	@JsonProperty("public")
	public void setPublic(boolean _public) {
		setAttribute("public", _public);
	}

	@JsonProperty("taxes_included")
	public String getTaxesIncluded() {
		return (String)getAttribute("taxes_included");
	}
	@JsonProperty("taxes_included")
	public void setTaxesIncluded(String _taxes_included) {
		setAttribute("taxes_included", _taxes_included);
	}

	@JsonProperty("domain")
	public String getDomain() {
		return (String)getAttribute("domain");
	}
	@JsonProperty("domain")
	public void setDomain(String _domain) {
		setAttribute("domain", _domain);
	}

	@JsonProperty("timezone")
	public String getTimezone() {
		return (String)getAttribute("timezone");
	}
	@JsonProperty("timezone")
	public void setTimezone(String _timezone) {
		setAttribute("timezone", _timezone);
	}

	@JsonProperty("tax_shipping")
	public String getTaxShipping() {
		return (String)getAttribute("tax_shipping");
	}
	@JsonProperty("tax_shipping")
	public void setTaxShipping(String _tax_shipping) {
		setAttribute("tax_shipping", _tax_shipping);
	}

	@JsonProperty("phone")
	public String getPhone() {
		return (String)getAttribute("phone");
	}
	@JsonProperty("phone")
	public void setPhone(String _phone) {
		setAttribute("phone", _phone);
	}

	@JsonProperty("currency")
	public String getCurrency() {
		return (String)getAttribute("currency");
	}
	@JsonProperty("currency")
	public void setCurrency(String _currency) {
		setAttribute("currency", _currency);
	}

	@JsonProperty("province")
	public String getProvince() {
		return (String)getAttribute("province");
	}
	@JsonProperty("province")
	public void setProvince(String _province) {
		setAttribute("province", _province);
	}

	@JsonProperty("source")
	public String getSource() {
		return (String)getAttribute("source");
	}
	@JsonProperty("source")
	public void setSource(String _source) {
		setAttribute("source", _source);
	}

	@JsonProperty("myshopify_domain")
	public String getMyshopifyDomain() {
		return (String)getAttribute("myshopify_domain");
	}
	@JsonProperty("myshopify_domain")
	public void setMyshopifyDomain(String _myshopify_domain) {
		setAttribute("myshopify_domain", _myshopify_domain);
	}

	@JsonProperty("email")
	public String getEmail() {
		return (String)getAttribute("email");
	}
	@JsonProperty("email")
	public void setEmail(String _email) {
		setAttribute("email", _email);
	}

}
