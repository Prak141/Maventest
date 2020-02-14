package com.prakash.mavenunittest1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.maventest.test.test;

public class testcase4 {

	test test1 =  new test();
	String result = test1.validatetest();
	
	@Test
	public void validatetest() {
		assertEquals(result,"This is test Meth");	
	}
	
}
