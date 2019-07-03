package au.edu.act.cgs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentSave implements StudentFunction{
	static Scanner in = new Scanner(System.in);
	public void execute() throws Exception{
		Student student = get();
		      BufferedWriter bw = null;
		      try {
			 String mycontent = student.getName()  + ", " + student.getYear() + ", " + student.getId() + StudentManagement.lineBreak;
			 File file = new File("C:\\Users\\zilin\\Desktop\\Student Data.txt");

			  if (!file.exists()) {
			     file.createNewFile();

			  FileWriter fw = new FileWriter(file);
			  bw = new BufferedWriter(fw);
			  bw.write(mycontent);
		          System.out.println("File written Successfully");
		          
			  } else {
				FileWriter fr = new FileWriter(file, true);
				bw = new BufferedWriter(fr);
				bw.write(mycontent);  
			  }

		      } catch (IOException ioe) {
			   ioe.printStackTrace();
			}
			finally
			{ 
			   try{
			      if(bw!=null)
				 bw.close();
			   }catch(Exception ex){
			       System.out.println("Error in closing the BufferedWriter"+ex);
			    }
			}
	}
	
	public Student get() {
		
		System.out.println("Please enter student name.");
		String inName = in.nextLine();
		
		System.out.println("Please enter student year.");
		int inYear = in.nextInt();
		in.nextLine();
		
		System.out.println("Please enter student ID.");
		int inId = in.nextInt();
		in.nextLine();
		
		Student student = new Student(inName, inYear, inId);
		return student;
	}
	}
