package com.hantsylabs.example.conference.model;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;


@Entity	
public class Room extends AbstractPersistable<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	public Room() {}

	public Room(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
