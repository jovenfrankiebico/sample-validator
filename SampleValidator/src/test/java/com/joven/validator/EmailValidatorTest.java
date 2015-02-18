package com.joven.validator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class EmailValidatorTest {

	@Test
	public void test() throws Exception {
		
		@SuppressWarnings("serial")
		List<String> emails = new ArrayList<String>(){{
			add("abz'abx@gmail.com");
			add("ja'y.'turla@yahoo.com");
		}};
		
		for (String theEmail : emails) {
			boolean result = EmailValidator.validate(theEmail);
			assertTrue("Invalid Email: "+theEmail, result);
		}
		
	}
	
}
