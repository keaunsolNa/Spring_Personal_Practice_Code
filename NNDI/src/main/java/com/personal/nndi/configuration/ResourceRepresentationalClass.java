package com.personal.nndi.configuration;

public class ResourceRepresentationalClass {

	private final long id;
	private final String content;
	private final String location;
	
	public ResourceRepresentationalClass(long id, String content, String location) {
		this.id = id;
		this.content = content;
		this.location = location;
	}
	
	public long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}
	
	public String getlocation() {
		return location;
	}
}
