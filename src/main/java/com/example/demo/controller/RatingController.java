package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RatingRequest;
import com.example.demo.dto.RatingResponse;
import com.example.demo.service.RatingService;

@RestController
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
	@PostMapping("/rating")
	public RatingResponse getRating(@RequestBody RatingRequest ratingRequest) throws InterruptedException {
		//Thread.sleep(4000); //to test rating service timeout
		return ratingService.getRatingWithMovieId(ratingRequest);
	}

}
