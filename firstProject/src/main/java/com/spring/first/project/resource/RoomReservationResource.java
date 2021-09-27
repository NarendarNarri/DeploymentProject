package com.spring.first.project.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.first.project.service.ReservationService;

@RestController
@RequestMapping("/reservations")
public class RoomReservationResource {
	
	private final ReservationService reservationService;
	
	@Autowired
	public RoomReservationResource(ReservationService reservationService) {
		this.reservationService = reservationService;
	}
	
	@GetMapping("/test")
	public String getReservatations() {
		return "Api called successfully";
	}

}
