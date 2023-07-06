package com.example.demo.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RatingRequest implements Serializable {

	private static final long serialVersionUID = 1435815598025338781L;
	
	private long movieId;

}
