package com.example.demo.dto;

import java.io.Serializable;

import com.example.demo.model.Rating;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RatingResponse implements Serializable {

	private static final long serialVersionUID = -5580095719441487179L;
	
	private CodeValue codeValue;
	private Rating rating;
	
}
