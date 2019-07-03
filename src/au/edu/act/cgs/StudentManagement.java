package au.edu.act.cgs;

import java.util.Scanner;

public class StudentManagement {
	static String lineBreak = "\r\n";
	static String inFunction = "";
	static String function = "";
	static Scanner in = new Scanner(System.in);

	public static void main (String args[]) throws Exception {
		while(function != "exit") {
		System.out.println("Please enter save, search, delete or exit!");
		inFunction = in.nextLine();
		function = inFunction;		
		StudentFunction studentFunction = null;		
		
		if(function.equals("save")) {
			studentFunction = new StudentSave();
			
		} else if(function.equals("search")) {
			studentFunction = new StudentSearch();
		
		}else if(function.equals("delete")) {
			studentFunction = new StudentDelete();
			
		} else if(function.equals("exit")) {
			System.out.println("This function does not exist.");
			break;
		}
		studentFunction.execute();
	}
	}
}