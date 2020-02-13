package za.co.agent.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public abstract class Agent {

	@Id
	private String id;
	private String name;
	private String phoneNumber;
	
	/**
	 * 
	 */
	public Agent() {
		/* A declared default constructor is required by spring boot */
	}
	
	public Agent(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber=phoneNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	
		
}
