package com.spring.first.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ROOM")
public class Room {
	
	@Id
	@Column(name = "ROOM_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long roomid;
	
	@Column(name = "NAME")
	String name;
	
	@Column(name = "ROOM_NUMBER")
	private String roomNumber;
	
	@Column(name = "BED_INFO")
	private String bedinfo;

	public long getRoomid() {
		return roomid;
	}

	public void setRoomid(long roomid) {
		this.roomid = roomid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getBedinfo() {
		return bedinfo;
	}

	public void setBedinfo(String bedinfo) {
		this.bedinfo = bedinfo;
	}

}
