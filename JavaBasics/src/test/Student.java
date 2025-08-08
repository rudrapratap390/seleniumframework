package test;

//class is blueprint that defines the structure (attributes) and behavior (methods) of an object the class can have

public class Student {
	
	private String firstName;
	private String lastName;
	protected int age;
	
	Student(String firstName,String lastName,int age){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
	}
	
	public void getStudentDetails() {
		
		System.out.println(firstName + lastName + age);
	}
	
	
	

}
