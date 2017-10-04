package examples.myprojects;

import java.util.Scanner;

public class numbers 
{
	public static void main(String args[])
	{
		
//Student Name : 		Diarmuid Mc Evoy
//Student Id Number : 	C00203210
//Date :				15/08/2017
//Purpose : 			A Simple program to add two numbers entered from the keyboard
		
		Scanner console = new Scanner (System.in);
		 
		int myInt ;
		float myFloat;
		double myDouble;
		String myString;
		char myCharacter;
		long myLong;
		String sentence;

		System.out.println("Enter int ");
		myInt  =  console.nextInt();    //integers
		System.out.println("Enter float ");
		myFloat  =  console.nextFloat();    //float
		System.out.println("Enter Long ");
		myLong  =  console.nextLong();    //long
		System.out.println("Enter  double ");
		myDouble = console.nextDouble();   //doubles
		System.out.println("Enter string ");
		myString = console.next();    //strings
		System.out.println("Enter char ");
		myCharacter = console.next ().charAt(0);    //characters
		System.out.println("Enter sentence ");
		sentence  =  console.nextLine();    //sentence

		System.out.println("I have enterd int " + myInt);
		System.out.println("I have enterd float " + myFloat);
		System.out.println("I have enterd long " + myLong);
		System.out.println("I have enterd double " + myDouble);
		System.out.println("I have enterd String " + myString);
		System.out.println("I have enterd character " + myCharacter);
		System.out.println("I have enterd sentence " + sentence);
		
		console.close();

	 }//main
	}//class



/*		package examples.myprojects;

import java.util.Scanner;

public class numbers 
{
	public static void main(String args[])
	{
		
//Student Name : 		Diarmuid Mc Evoy
//Student Id Number : 	C00203210
//Date :				15/08/2017
//Purpose : 			A Simple program to add two numbers entered from the keyboard
		
		Scanner console = new Scanner (System.in);
		 
		int myInt ;
		float myFloat;
		long myLong;
		double myDouble;
		String myString;
		

		System.out.println("Enter int ");
		myInt  =  console.nextInt();    //integers
		System.out.println("Enter float ");
		myFloat  =  console.nextFloat();    //float
		System.out.println("Enter Long ");
		myLong  =  console.nextLong();    //long
		System.out.println("Enter  double ");
		myDouble = console.nextDouble();   //doubles
		System.out.println("Enter string ");
		myString = console.next();    //strings
		
		

		System.out.println("I have enterd int " + myInt);
		System.out.println("I have enterd float " + myFloat);
		System.out.println("I have enterd long " + myLong);
		System.out.println("I have enterd double " + myDouble);
		System.out.println("I have enterd String " + myString);
		
		System.out.println(myInt + myFloat);
		
		
		
		console.close();

	 }//main
	}//class			*/


