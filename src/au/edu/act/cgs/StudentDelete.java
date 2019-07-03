package au.edu.act.cgs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentDelete implements StudentFunction {
	static Scanner in = new Scanner(System.in);
	public void execute() throws Exception{
		String R1 = "";
		
		  System.out.println("Please enter student ID to delete.");
		  int inId = in.nextInt();
		  int searchID = inId;
		  in.nextLine();
			
		  File file = new File("C:\\Users\\zilin\\Desktop\\Student Data.txt"); 
		  
		  BufferedReader ba = new BufferedReader(new FileReader(file));
		 	  
		  String st;
			  while((st = ba.readLine())!= null) {
				  String[] studentInformation = st.split(", ");
				  Student student = new Student(studentInformation[0], new Integer(studentInformation[1]), new Integer(studentInformation[2]));
				  
				  if(student.getId() == searchID) {
					  R1 = st;
				  }
			  }
			  
			  ba.close();
			  
		String file2 = "C:\\Users\\zilin\\Desktop\\Student Data.txt";
		String lineToRemove1 = R1;
		
		try {

		      File inFile = new File(file2);

		      if (!inFile.isFile()) {
		        System.out.println("Parameter is not an existing file");
		        return;
		      }

		      File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

		      BufferedReader br = new BufferedReader(new FileReader(file2));
		      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

		      String line = null;

		     while ((line = br.readLine()) != null) {

		        if (!line.trim().equals(lineToRemove1)) {

		          pw.println(line);
		          pw.flush();
		        }
		      }
		     
		      pw.close();
		      br.close();

		      if (!inFile.delete()) {
		        System.out.println("Could not delete file");
		        return;
		      }

		     if (!tempFile.renameTo(inFile))
		        System.out.println("Could not rename file");

		    }
		    catch (FileNotFoundException ex) {
		      ex.printStackTrace();
		    }
		    catch (IOException ex) {
		      ex.printStackTrace();
		    }
	}

}
