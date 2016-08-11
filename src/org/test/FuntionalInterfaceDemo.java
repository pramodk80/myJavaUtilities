package org.test;

public class FuntionalInterfaceDemo {
	interface MyInter{
		 void hello();
		 }
		 public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 MyInter infVar = () -> {System.out.println("Hello World");};
		 infVar.hello();
		 }	 
}