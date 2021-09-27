package com.spring.first.project.repository;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.first.project.entity.Reservation;


@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
	
	Iterable<Reservation> findReservationByReservationDate(Date date);
}
