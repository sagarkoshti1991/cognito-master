package com.sagar.example.cognito.lang;

public class StringUtil {
	public static boolean isBlank(String str) {
		if (str == null || "".equalsIgnoreCase(str.trim())) {
			return true;
		}
		return false;
	}
}
