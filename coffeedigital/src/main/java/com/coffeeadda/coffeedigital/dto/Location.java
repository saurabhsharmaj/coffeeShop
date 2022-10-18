package com.coffeeadda.coffeedigital.dto;

public class Location {

	private String map_url;
	
	

	public String getMap_url() {
		return map_url;
	}

	public void setMap_url(String map_url) {
		this.map_url = map_url;
	}

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(String map_url) {
		super();
		this.map_url = map_url;
	}

	@Override
	public String toString() {
		return "Location [map_url=" + map_url + "]";
	}
	
	
}
