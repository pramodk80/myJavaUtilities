package org.test;

import java.util.Scanner;


public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B = sc.next();
		
		System.out.println(A.length() + B.length());
		
		System.out.println(A.compareTo(B)>0 ? "YES":"NO");
		
		sc.close();
		
		System.out.println(A.substring(0,1).toUpperCase()+ A.substring(1)+ " " +B.substring(0,1).toUpperCase() + B.substring(1));

	}

}
