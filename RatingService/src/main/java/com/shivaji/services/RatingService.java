package com.shivaji.services;

import java.util.List;

import com.shivaji.entities.Rating;

public interface RatingService {
	
	// create
	Rating create(Rating rating);
	
	// get all ratings
	List<Rating> getRatings();
	
	// get ratings by user
	List<Rating> getRatingByUser(String userId);
	
	// get ratings by hotel
	List<Rating> getRatingByHotel(String hotelId);
}
