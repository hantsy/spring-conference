package com.hantsylabs.example.conference.util;

public class Predicates {

	public static void nonNull(Object o) {
		if (o == null) {
			throw new IllegalArgumentException(o + " can not be null");
		}
	}
	
	public static void nonNull(Object o, String msg) {
		if (o == null) {
			throw new IllegalArgumentException(msg);
		}
	}
}
