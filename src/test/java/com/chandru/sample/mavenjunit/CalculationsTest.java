/**
 * 
 */
package com.chandru.sample.mavenjunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Chandru
 *
 */
public class CalculationsTest {

	private static IMethods calculations;

	@BeforeClass
	public static void initCalculator() {
		calculations = new Calculations();
	}
	
	@Before
	public void beforeEachTest() {
		System.out.println("Before Each Test");
	}
	
	@After
	public void afterEachTest() {
		System.out.println("After Each Test");
	}
	
	@AfterClass
	public static void freeCalculations() {
		calculations = null;
	}
	
	@Test
	public void testSum() {
		int result =  calculations.sum(10, 20);
		Assert.assertEquals(30, result);
	}
	
	@Test
	public void testDifferenceType1() {
		int result =  calculations.difference(20, 10);
		Assert.assertEquals(10, result);
	}
	
	@Test
	public void testDifferenceType2() {
		int result =  calculations.difference(15, 15);
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void testDifferenceType3() {
		int result =  calculations.difference(12, 15);
		Assert.assertEquals(3, result);
	}
	
	@Test
	public void testDifferenceType4() {
		int result =  calculations.difference(-12, 15);
		Assert.assertEquals(27, result);
	}
}
