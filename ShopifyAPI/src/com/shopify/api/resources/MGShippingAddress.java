/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in ShippingAddress.java
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

public class MGShippingAddress extends ShopifyResource {

	@JsonProperty("company")
	public String getCompany() {
		return (String)getAttribute("company");
	}
	@JsonProperty("company")
	public void setCompany(String _company) {
		setAttribute("company", _company);
	}

	@JsonProperty("city")
	public String getCity() {
		return (String)getAttribute("city");
	}
	@JsonProperty("city")
	public void setCity(String _city) {
		setAttribute("city", _city);
	}

	@JsonProperty("address1")
	public String getAddress1() {
		return (String)getAttribute("address1");
	}
	@JsonProperty("address1")
	public void setAddress1(String _address1) {
		setAttribute("address1", _address1);
	}

	@JsonProperty("name")
	public String getName() {
		return (String)getAttribute("name");
	}
	@JsonProperty("name")
	public void setName(String _name) {
		setAttribute("name", _name);
	}

	@JsonProperty("zip")
	public String getZip() {
		return (String)getAttribute("zip");
	}
	@JsonProperty("zip")
	public void setZip(String _zip) {
		setAttribute("zip", _zip);
	}

	@JsonProperty("latitude")
	public String getLatitude() {
		return (String)getAttribute("latitude");
	}
	@JsonProperty("latitude")
	public void setLatitude(String _latitude) {
		setAttribute("latitude", _latitude);
	}

	@JsonProperty("address2")
	public String getAddress2() {
		return (String)getAttribute("address2");
	}
	@JsonProperty("address2")
	public void setAddress2(String _address2) {
		setAttribute("address2", _address2);
	}

	@JsonProperty("country")
	public String getCountry() {
		return (String)getAttribute("country");
	}
	@JsonProperty("country")
	public void setCountry(String _country) {
		setAttribute("country", _country);
	}

	@JsonProperty("country_code")
	public String getCountryCode() {
		return (String)getAttribute("country_code");
	}
	@JsonProperty("country_code")
	public void setCountryCode(String _country_code) {
		setAttribute("country_code", _country_code);
	}

	@JsonProperty("province_code")
	public String getProvinceCode() {
		return (String)getAttribute("province_code");
	}
	@JsonProperty("province_code")
	public void setProvinceCode(String _province_code) {
		setAttribute("province_code", _province_code);
	}

	@JsonProperty("phone")
	public String getPhone() {
		return (String)getAttribute("phone");
	}
	@JsonProperty("phone")
	public void setPhone(String _phone) {
		setAttribute("phone", _phone);
	}

	@JsonProperty("last_name")
	public String getLastName() {
		return (String)getAttribute("last_name");
	}
	@JsonProperty("last_name")
	public void setLastName(String _last_name) {
		setAttribute("last_name", _last_name);
	}

	@JsonProperty("longitude")
	public String getLongitude() {
		return (String)getAttribute("longitude");
	}
	@JsonProperty("longitude")
	public void setLongitude(String _longitude) {
		setAttribute("longitude", _longitude);
	}

	@JsonProperty("province")
	public String getProvince() {
		return (String)getAttribute("province");
	}
	@JsonProperty("province")
	public void setProvince(String _province) {
		setAttribute("province", _province);
	}

	@JsonProperty("first_name")
	public String getFirstName() {
		return (String)getAttribute("first_name");
	}
	@JsonProperty("first_name")
	public void setFirstName(String _first_name) {
		setAttribute("first_name", _first_name);
	}

}
