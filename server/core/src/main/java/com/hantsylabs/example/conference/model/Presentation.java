package com.hantsylabs.example.conference.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.domain.AbstractAuditable;

public class Presentation extends AbstractAuditable<Presentation, Long>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String outline;
	
	@Embedded
	private Duration duration;
	
	@ManyToMany
	private List<User> speakers=new ArrayList<>();
	
	@OneToMany
	private List<Attachment> attachments=new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOutline() {
		return outline;
	}

	public void setOutline(String outline) {
		this.outline = outline;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public List<User> getSpeakers() {
		return speakers;
	}

	public void setSpeakers(List<User> speakers) {
		this.speakers = speakers;
	}
	
}
