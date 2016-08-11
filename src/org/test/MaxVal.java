package org.test;

import java.util.Arrays;

public class MaxVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] myArray = new int[]{1, 3, 8, 5, 7, };

			    // TODO: Take appropriate action if the array is empty.

			    int max_value = Integer.MIN_VALUE;

			    for ( int value : myArray ) {
			        if ( value > max_value ) {
			            max_value = value;
			        }
			    }
			    
			    System.out.println("max value is "+max_value);
			}
	
	

}
