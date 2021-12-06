package com.mood.analyser;

public class MoodAnalyser {
	/**
	 * UC-1:- Given a Message, ability to analyse and respond Happy or Sad Mood.
	 **/
	public String analyseMood(String input_message) {
		if (input_message.contains("happy")) {
			return "HAPPY";
		} else {
			return "SAD";
		}
	}
}
