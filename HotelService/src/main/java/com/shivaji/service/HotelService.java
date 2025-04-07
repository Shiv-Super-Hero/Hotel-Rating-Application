package com.shivaji.service;

import java.util.List;

import com.shivaji.entity.Hotel;

public interface HotelService {
	//create
	Hotel create(Hotel hotel);
	
	//getAll
	List<Hotel> getAll();
	
	//getSingle
	Hotel get(String id);
}
