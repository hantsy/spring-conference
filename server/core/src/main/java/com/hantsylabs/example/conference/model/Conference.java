package com.hantsylabs.example.conference.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
public class Conference extends AbstractAuditable<Conference, Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	private String name;

	@NotNull
	private String description;

	@NotNull
	private String slug;
	
	@Embedded
	Duration duration;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "conference")
	private Set<Signup> signups = new HashSet<Signup>();

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public Set<Signup> getSignups() {
		return this.signups;
	}

	public void setSignups(Set<Signup> signups) {
		this.signups = signups;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.SHORT_PREFIX_STYLE);
	}


	public void addSignup(Signup signup) {
		if (!this.signups.contains(signup)) {
			signups.add(signup);
			signup.setConference(this);
		}
	}
}
