package com.joven.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	private static Pattern pattern;
	private static Matcher matcher;
	
	private static final String EMAIL_PATTERN = 
			"^['_A-Za-z0-9-]+(\\.['_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	static {
		pattern = Pattern.compile(EMAIL_PATTERN);
	}
	
	public static boolean validate(String email) {
		boolean result = false;
		
		pattern.matcher(email);
		
		matcher = pattern.matcher(email);
		result = matcher.matches();
		
		return result;
	}
	
}
