package com.lti.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;
import com.lti.demo.MyApp;

class MyAppTest {

	
	/*void test() {
		fail("Not yet implemented");
	}*/
	@Test
		void testShow()
		{
			MyApp m = new MyApp();
			String s=m.show();
			Assertions.assertEquals("Hello maven", s);
			
		}
	@Test
		void testAdd()
		{
			  int r=Calculator.add(100,200);
			  Assertions.assertEquals(300,r);
			  Assertions.assertEquals(100,Calculator.add(50, 50));
			  Assertions.assertNotEquals(100,r);
		
		
		}
		
	@Test
		void testAssertFalse()
		{
		Assertions.assertFalse("Akash".length()==10);
		Assertions.assertFalse(10>20,"comparing two values ");
		}
	
	@Test
	void testAssertNull()
	{
		String s1=null;
		String s2="abc";
		Assertions.assertNull(s2);
		Assertions.assertNotNull(s2);
	}

	/*@Test
	void testCollections()
	{
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Hello");
		Assertions.assertFalse(myList.isEmpty());
		
		ArrayList<Integer> myList1 = new ArrayList<>();
		Assertions.assertEquals(true, myList1.isEmpty());
	}
 @Test
	void testAssertAll()
	{
		String str1 = "abc";
		String str2 = "pqr";
		String str3 = "xyz";
		Assertions.assertAll("data",
				() -> Assertions.assertEquals(str1, "abc"),
				() -> Assertions.assertEquals(str2, "pqr"),
				() -> Assertions.assertEquals(str3, "xyz")
				);
	}

*/
 
		
		
	
		
		
		
		}

