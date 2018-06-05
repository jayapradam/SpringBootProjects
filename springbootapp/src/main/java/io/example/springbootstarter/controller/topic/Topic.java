package io.example.springbootstarter.controller.topic;

public class Topic {
	
	private String id;
	private String name;
	private String description;
	
	
	public Topic() {
		super();
	}
	

	public Topic(String id,String name,String desc)
	{
		
		
		this.id= id;
		this.name = name;
		this.description = desc;
		
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

}
