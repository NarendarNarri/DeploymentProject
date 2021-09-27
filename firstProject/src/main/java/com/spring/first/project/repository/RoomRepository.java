package com.spring.first.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.first.project.entity.Room;

@Repository
public interface RoomRepository  extends CrudRepository<Room, Long>{
	

}
