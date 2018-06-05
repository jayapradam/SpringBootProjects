package io.example.springbootstarter.controller.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.example.springbootstarter.controller.topic.Topic;

@Entity
public class Course {

	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private Topic topic;

	public Course() {
		super();
	}

	public Course(String id, String name, String desc, String topicId) {

		this.id = id;
		this.name = name;
		this.description = desc;
		this.topic = new Topic(topicId, "", "");

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

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
