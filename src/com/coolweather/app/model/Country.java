package com.coolweather.app.model;

public class Country {
	
	private int id;
	private String countryName;
	private String countryCode;
	private int cityId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public int getcityId() {
		return this.cityId;
	}
	public void setcityId(int cityId) {
		this.cityId = cityId;
	}
	
}
