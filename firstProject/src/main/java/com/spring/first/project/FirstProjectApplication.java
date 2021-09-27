package com.spring.first.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
	}
	
//	@RestController
//	@RequestMapping("/api")
//	public class RoomResource {
//		
//		@Autowired
//		private RoomRepository roomRepository; 
//		
//		@GetMapping("/rooms")
//		public Iterable<Room> getRooms() {
//			return this.roomRepository.findAll();
//		}
//
//	}

}
