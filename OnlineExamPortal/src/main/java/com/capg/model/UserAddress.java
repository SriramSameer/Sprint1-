package com.capg.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotEmpty;

@Embeddable
	public class UserAddress {
	
	@Column(name = "address_country")
	@NotEmpty(message = "Address country cannot be empty")
	private String country;
	@Column(name = "address_state")
	@NotEmpty(message = "Address state cannot be empty")
	private String state;
	@Column(name = "address_city")
	@NotEmpty(message = "Address city cannot be empty")
	private String city;
	@Column(name = "address_zip")
	private String zip;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "UserAddress [country=" + country + ", state=" + state + ", city=" + city + ", zip=" + zip + "]";
	}
}
