package examples.myprojects;

import java.util.Scanner;

public class multiply 
{
	public static void main(String args[])
	{
		
//Student Name : 		Diarmuid Mc Evoy
//Student Id Number : 	C00203210
//Date :				15/08/2017
//Purpose : 			A Simple program to add two numbers entered from the keyboard
		
		Scanner console = new Scanner (System.in);
		 
	 	int number1; 
	 	int number2;
	 	int number3;
	 	int answer;
	 
	   	System.out.print("Enter first number -> ");   
		number1 = console.nextInt();
		System.out.print("Enter second number -> ");   
		number2 = console.nextInt();
		System.out.print("Enter Third number -> ");
		number3 = console.nextInt();
	 	answer = number1 * number2 * number3;
	 	System.out.println("The sum of the two numbers is " + answer ); 
	 	
	 	console.close();
	 }//main
	}//class

