package com.Portnov;

import org.junit.After;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
@Category(FastTest.class)

public class JUnitTemplate {
	@BeforeClass
	public static void oneTimeSetUp()
	{
		System.out.println("before class");
	}
	
	@Before
	
	public void setUp() {
		System.out.println("before");
		
	}
		
			
	
	@Test
	
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	@Ignore
	public void test2()
	{
		System.out.println("test2");
	}
@After
public void tearDown()
{
System.out.println("after");
}
@AfterClass
public static void oneTimeTearDown()

{
System.out.println("after class");	
}
}
