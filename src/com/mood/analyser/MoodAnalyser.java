package com.mood.analyser;

public class MoodAnalyser {
	/**
	 * UC-1(REFACTOR) :- Refactor the code to take the mood message in Constructor.
	 **/

	String input_message;

	// Default constructor.
	public MoodAnalyser() {

	}

	// Constructor overloading.
	public MoodAnalyser(String input_message) {
		this.input_message = input_message;
	}

	public String analyseMood() {
		if (input_message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
}
