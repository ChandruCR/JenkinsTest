/**
 * 
 */
package com.chandru.sample.mavenjunit;

/**
 * @author Chandru
 *
 */
public class Calculations implements IMethods {

	/* (non-Javadoc)
	 * @see com.chandru.sample.mavenjunit.IMethods#sum(int, int)
	 */
	@Override
	public int sum(int value1, int value2) {
		// TODO Auto-generated method stub
		return value1 + value2;
	}

	/* (non-Javadoc)
	 * @see com.chandru.sample.mavenjunit.IMethods#difference(int, int)
	 */
	@Override
	public int difference(int value1, int value2) {
		// TODO Auto-generated method stub
		if(value1 >= value2)
			return value1 - value2;
		else 
			return value2- value1;
	}

}
