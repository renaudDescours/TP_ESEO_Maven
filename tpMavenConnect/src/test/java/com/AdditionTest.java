package com;

import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {

	@Test
	public void testAddition(){
		Long a = (long) 4;
		Long b = (long) 9;
		Addition additionneur = new Addition();
		Long result = additionneur.calculer(a, b);
		Long wantedR = a+b;
		Assert.assertEquals(wantedR, result);
		Assert.assertTrue("13==13", result != wantedR);
	}
	
}
