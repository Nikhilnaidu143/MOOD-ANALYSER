package com.mood.analyser;

public class MoodAnalyser {
	/**
	 * UC-1(REFACTOR) :- Refactor the code to take the mood message in Constructor.
	 **/
	private String input_message;

	// Default constructor.
	public MoodAnalyser() {

	}

	// Constructor overloading.
	public MoodAnalyser(String input_message) {
		this.input_message = input_message;
	}

	/** UC-2 :- Handle Exception if User Provides Invalid Mood. **/
	public String analyseMood() {
		try {
			if (input_message.contains("Sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException ex) {
			return "HAPPY";
		}
	}
}
