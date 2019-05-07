package com.score;

public class ScoreFormatException extends Exception {

	@Override
	public String getMessage() {
		return "Score format invalid, cannot convert to int";
	}

	

}
