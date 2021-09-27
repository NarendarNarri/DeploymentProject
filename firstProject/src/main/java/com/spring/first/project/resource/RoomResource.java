package com.spring.first.project.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.first.project.entity.Room;
import com.spring.first.project.repository.RoomRepository;

@RestController
@RequestMapping("/api")
public class RoomResource {
	
	private static final Logger log = LoggerFactory.getLogger(RoomResource.class);
	
	@Autowired
	private RoomRepository roomRepository; 
	
	@GetMapping("/rooms")
	public Iterable<Room> getRooms() {
		return this.roomRepository.findAll();
	}

}
