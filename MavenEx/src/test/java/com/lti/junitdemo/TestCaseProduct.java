package com.lti.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Product;

class TestCaseProduct {


	@Test
	public void testCompanyName() {
		Product p = new Product(101,"charger",10000.00,"Dmart");
		Assertions.assertEquals("Dmart",p.getCompanyName());
	}
	
	/*@Test
	public void testExceptions() {		
		
	    Exception exception = Assertions.assertThrows(NumberFormatException.class, () -> {
	        Integer.parseInt("100assff");
	        });

	    String expectedMessage = "For input string";
	    String actualMessage = exception.getMessage();
	    Assertions.assertTrue(actualMessage.contains(expectedMessage));
	   // Assertions.assertEquals(expectedMessage,actualMessage);
	    
	*/
	    
	    

}
