package com.lcwd.rating.service;

import com.lcwd.rating.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    //create
     Rating create(Rating rating);

    //get all ratings
     List<Rating> getRatings();

    // get all by UserID
    List<Rating> getRatingByUserId(String uderId);

    // get all by hotel
    List<Rating> getRatingByHotelId(String hotelId);
}
