package au.edu.act.cgs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class StudentSearch implements StudentFunction{
	static Scanner in = new Scanner(System.in);
	public void execute() throws Exception{
		 System.out.println("Please enter student ID to search.");
		  int inId = in.nextInt();
		  int searchID = inId;
		  in.nextLine();
			
		  File file = new File("C:\\Users\\zilin\\Desktop\\Student Data.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file));
		 	  
		  String st;
			  while((st = br.readLine())!= null) {
				  String[] studentInformation = st.split(", ");
				  Student student = new Student(studentInformation[0], new Integer(studentInformation[1]), new Integer(studentInformation[2]));
				  
				  if(student.getId() == searchID) {
		    		  System.out.println("Name: " + student.getName() + " ID: " + student.getId() + " Year: " + student.getYear());
		    } 
			  }
			  br.close();
	}

}
