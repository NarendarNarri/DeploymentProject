package com.spring.first.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.spring.first.project.repository.GuestRepository;
import com.spring.first.project.repository.ReservationRepository;

@ComponentScan("com.spring.first.project.repository")
@Service
public class ReservationService {
	
	
	@Autowired
	GuestRepository guestRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	
	
	

//	public List<RoomResrvation> getRoomReservationsForDate(Date date) {
//		Iterable<Room> rooms = roomRepository.findAll();
//		Map<Long,RoomResrvation> roomReservationMap = new HashMap<Long,RoomResrvation>();
//		
//		rooms.forEach(room -> {
//			RoomResrvation roomResrvation = new RoomResrvation();
//			roomResrvation.setRoomId(room.getRoomid());
//			roomResrvation.setRoomName(room.getName());
//			roomResrvation.setRoomNumber(room.getRoomNumber());
//			roomReservationMap.put(room.getRoomid(),roomResrvation );
//		});
//		
//		Iterable<Reservation> reservations = reservationRepository.findReservationByReservationDate(new java.sql.Date(date.getTime()));
//		reservations.forEach(reservation -> {
//			RoomResrvation roomReservation = roomReservationMap.get(reservation.getRoomId());
//			roomReservation.setDate(date);
//			
//			Guest guest = guestRepository.findById(reservation.getGuestId()).get();
//			roomReservation.setFirstName(guest.getFirstName());
//			roomReservation.setLastName(guest.getLastName());
//			roomReservation.setGuestId(guest.getGuestId()+"");
//			
//		});
//		
//		List<RoomResrvation> list = new ArrayList<RoomResrvation>();
//		
//		for(Long id : roomReservationMap.keySet()) {
//			list.add(roomReservationMap.get(id));
//		}
//		
//		return list;
//	}
}
