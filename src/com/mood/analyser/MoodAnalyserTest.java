package com.mood.analyser;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyserTest {
	static MoodAnalyser moodAnalyser;

	@BeforeClass
	public static void initialize() {
		moodAnalyser = new MoodAnalyser();
	}

	/** T.C-1.1:- Given “I am in Sad Mood” message Should Return SAD. **/
	@Test
	public void analysing_mood_when_sad_should_return_sad() {
		String input_message = "I am in Sad Mood";
		String currentMood = moodAnalyser.analyseMood(input_message);
		assertEquals("SAD", currentMood);
	}

	/** T.C-1.2:- Given “I am in Any Mood” message Should Return HAPPY. **/
	@Test
	public void analysing_mood_when_happy_should_return_happy() {
		String input_message = "I am in Any Mood";
		String currentMood = moodAnalyser.analyseMood(input_message);
		assertEquals("HAPPY", currentMood);
	}
}
