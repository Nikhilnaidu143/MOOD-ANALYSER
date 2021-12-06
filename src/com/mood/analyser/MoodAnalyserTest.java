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

	@Test
	public void analysing_mood_when_happy_should_return_happy() {
		String input_message = "i am in happy mood";
		String currentMood = moodAnalyser.analyseMood(input_message);
		assertEquals("HAPPY", currentMood);
	}

	@Test
	public void analysing_mood_when_sad_should_return_sad() {
		String input_message = "i am in sad mood";
		String currentMood = moodAnalyser.analyseMood(input_message);
		assertEquals("SAD", currentMood);
	}
}
