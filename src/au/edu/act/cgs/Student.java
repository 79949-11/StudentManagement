package au.edu.act.cgs;

public class Student {
	private String name;
	private int id;
	private int year;
	
	public Student(String nameToSet, int idToSet, int yearToSet){
		name = nameToSet;
		id = idToSet;
		year = yearToSet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}		
}
