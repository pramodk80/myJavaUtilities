package org.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringFounder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		
		String str = s.next();

		int num = s.nextInt();
		int tempNum = num;
		List<String> strList = new ArrayList<String>();
		String substr="";
		for(int i=0;i<= str.length();i++) {
			//System.out.println(i);
			if(i==str.length()+1-num) {
				//System.out.println(i);
				break;
			}
			substr=str.substring(i,tempNum++);
			//System.out.println("in first loop "+substr);
			strList.add(substr);
			
			
		}
		
		Collections.sort(strList);
		
		System.out.println(strList.get(0));
		
		System.out.println(strList.get(strList.size()-1));
	}

}
