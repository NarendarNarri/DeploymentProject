package com.spring.first.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.spring.first.project.entity.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
