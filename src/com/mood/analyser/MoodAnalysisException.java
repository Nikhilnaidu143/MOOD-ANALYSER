package com.mood.analyser;

public class MoodAnalysisException extends Exception {

	/** enum which extends Enum class **/
	enum type_of_exception {
		NULL_MOOD_EXCEPTION, EMPTY_MOOD_EXCEPTION;
	}

	public MoodAnalysisException(String input_message) {
		super(input_message);
	}
}
