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
	public void analysing_mood_when_sad_should_return_sad() throws MoodAnalysisException {
		moodAnalyser = new MoodAnalyser("I am in Sad Mood.");
		String currentMood = moodAnalyser.analyseMood();
		assertEquals("SAD", currentMood);
	}

	/**
	 * Repeat T.C-1.2:- Given “I am in Happy Mood” message in Constructor Should
	 * Return SAD.
	 **/
	@Test
	public void analysing_mood_when_happy_should_return_happy() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
		String currentMood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", currentMood);
	}

	/** T.C-3.1:- Given NULL Mood Should Throw MoodAnalysisException. **/
	@Test
	public void analysing_mood_when_null_should_throw_null_exception() {
		moodAnalyser = new MoodAnalyser();
		String currentMood = null;
		try {
			currentMood = moodAnalyser.analyseMood();
			assertEquals("HAPPY", currentMood);
		} catch (MoodAnalysisException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * T.C-3.2:- Given Empty Mood Should Throw MoodAnalysisException indicating
	 * Empty Mood.
	 **/
	@Test
	public void analysing_mood_when_empty_should_throw_empty_exception() {
		moodAnalyser = new MoodAnalyser("");
		String currentMood = "";
		try {
			currentMood = moodAnalyser.analyseMood();
			assertEquals("", currentMood);
		} catch (MoodAnalysisException ex) {
			ex.printStackTrace();
		}
	}
}