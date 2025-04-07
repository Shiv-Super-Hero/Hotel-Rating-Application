package com.shivaji.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivaji.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String> {

}
