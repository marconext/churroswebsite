package com.churros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.churros.entity.Event;


public interface EventRepository extends JpaRepository<Event, Long> {
}
