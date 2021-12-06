package com.mood.analyser;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MoodAnalyserTest {
	static MoodAnalyser moodAnalyser;

	/**
	 * Repeat T.C-1.1:- Given “I am in Sad Mood” message in Constructor Should
	 * Return SAD.
	 **/
	@Test
	public void analysing_mood_when_sad_should_return_sad() {
		moodAnalyser = new MoodAnalyser("I am in Sad Mood.");
		String currentMood = moodAnalyser.analyseMood();
		assertEquals("SAD", currentMood);
	}

	/** T.C-2.1:- Given Null Mood Should Return Happy. **/
	@Test
	public void analysing_mood_when_null_should_return_happy() {
		moodAnalyser = new MoodAnalyser(null);
		String currentMood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", currentMood);
	}

	/**
	 * Repeat T.C-1.2:- Given “I am in Happy Mood” message in Constructor Should
	 * Return SAD.
	 **/
	@Test
	public void analysing_mood_when_happy_should_return_happy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
		String currentMood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", currentMood);
	}
}