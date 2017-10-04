package ie.ITcarlow.OOSD.Lab3;

import java.util.Scanner;

//Student Name : 		Diarmuid Mc Evoy
//Student Id Number : 	C00203210
//Date :				21/09/2017
//Purpose : 			Write a program to read in a string from the keyboard into a variable using 
//						the Scanner class. It should then print out the letters of the string in 
//						reverse order.

public class reverseString
{
	public static void reverse(String words)
	{
		StringBuilder stringBuilder = new stringBuilder();
		String[] words = String.split(" "),
		
		 for (int j = words.length-1; j >= 0; j--) { 
		 stringBuilder.append(words[j]).append(' ');
		 	}
		    	System.out.println("Reverse : " + stringBuilder);
			}
	
	public static void main(String args[])
	{

		Scanner console = new Scanner (System.in);
		
		String words;
		int no_of_chars;
		int space;
		
		System.out.print("Enter Words");
		words = nextLine();
			
		
		console.close();
			
			
		
		
		
}

	private static String nextString() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}
}