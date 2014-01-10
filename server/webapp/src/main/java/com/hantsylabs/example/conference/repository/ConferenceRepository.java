package com.hantsylabs.example.conference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.hantsylabs.example.conference.model.Conference;

@Repository
public interface ConferenceRepository extends JpaRepository<Conference, Long>,
		JpaSpecificationExecutor<Conference> {

	Conference findBySlug(String id);

}
