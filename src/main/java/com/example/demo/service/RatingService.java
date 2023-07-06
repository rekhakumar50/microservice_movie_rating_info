package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.RatingRequest;
import com.example.demo.dto.RatingResponse;
import com.example.demo.model.Rating;

@Service
public class RatingService {
	
	public RatingResponse getRatingWithMovieId(RatingRequest ratingRequest) {
		RatingResponse ratingResponse = new RatingResponse();
		final long movieId = ratingRequest.getMovieId();
		
		this.getRatings().stream()
						.filter(r -> movieId == r.getMovieId())
						.findFirst()
						.ifPresent(ratingResponse::setRating);
		return ratingResponse;
	}
	
	
	private List<Rating> getRatings() {
		return Arrays.asList(
				new Rating(123, 4),
				new Rating(234, 5),
				new Rating(345, 2.5));
		
	}

}
