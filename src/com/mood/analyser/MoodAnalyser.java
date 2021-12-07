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

	/** UC-3 :- Inform user if entered Invalid Mood. **/
	public String analyseMood() throws MoodAnalysisException {
		if (input_message == null) {
			throw new MoodAnalysisException(
					MoodAnalysisException.type_of_exception.NULL_MOOD_EXCEPTION + " Please enter valid message.");

		} else if (input_message.isEmpty()) {
			throw new MoodAnalysisException(
					MoodAnalysisException.type_of_exception.EMPTY_MOOD_EXCEPTION + " Please enter valid message.");

		} else if (input_message.contains("Sad")) {
			return "SAD";

		} else {
			return "HAPPY";
		}
	}
}
