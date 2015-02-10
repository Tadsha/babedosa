package metier;

import java.util.ArrayList;

public class Academy {

	private int codeAcademy;
	private static String name;
	private String country;
	private String city;
	private ArrayList<Person> students;
	
	public Academy(int c, String n, String co, String ci){
		codeAcademy = c; 
		name = n;
		country = co;
		city = ci;
		students = null;
	}

	public int getCodeAcademy() {
		return codeAcademy;
	}

	public void setCodeAcademy(int codeAcademy) {
		this.codeAcademy = codeAcademy;
	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public ArrayList<Person> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Person> students) {
		this.students = students;
	}
	
	// Method to add one student to an academy
	public void AddStudent(Person person){
		if ((person.getAge()<14)||(person.getName()== null)||(person.getFirstName()== null)){
			System.out.println("Error : Studient not admissible");
		}
		else 
			students.add(person);
			person.setAcademy(Academy.getName());
	}
}
