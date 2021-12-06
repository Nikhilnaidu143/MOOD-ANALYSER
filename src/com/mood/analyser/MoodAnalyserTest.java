package com.mood.analyser;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyserTest {

	/**
	 * Repeat T.C-1.1:- Given “I am in Sad Mood” message in Constructor Should
	 * Return SAD.
	 **/
	@Test
	public void analysing_mood_when_sad_should_return_sad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood.");
		String currentMood = moodAnalyser.analyseMood();
		assertEquals("SAD", currentMood);
	}

	/**
	 * Repeat T.C-1.2:- Given “I am in Happy Mood” message in Constructor Should
	 * Return SAD.
	 **/
	@Test
	public void analysing_mood_when_happy_should_return_happy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood.");
		String currentMood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", currentMood);
	}
}