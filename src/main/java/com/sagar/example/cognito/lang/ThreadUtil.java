package com.sagar.example.cognito.lang;

public class ThreadUtil {
	public static void sleepQuietly(int millis) {
		try {
			Thread.sleep(millis);
		} catch (Exception e) {

		}
	}
}
