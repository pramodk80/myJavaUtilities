package org.test;

public class Palendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("return is palendrome " + isPalindromeString("madam"));
		
		byte [] bt ="abc".getBytes();
		
		for (byte b : bt) {
			System.out.println("bytes  "+b);
		}
		
		
	}	
		
		private static boolean isPalindromeString(String str) {
		    if (str == null)
		        return false;
		    int length = str.length();
		    System.out.println(length / 2);
		    for (int i = 0; i < length / 2; i++) {
		 
		        if (str.charAt(i) != str.charAt(length - i - 1))
		            return false;
		    }
		    return true;
		}

	

}
