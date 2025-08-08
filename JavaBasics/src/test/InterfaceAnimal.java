package test;

/*
 * can have abstarct , default and static method
 * access modifier = implicitly public
 * variables are implicitly public static and final
 * 
 */

public interface InterfaceAnimal {
	
	String animalCat = "pet";
	
	
	//abstract method
	
	public void makeSound();
	
	//default method 
	
	public default void eat() {
		
		System.out.println("Animal eat grass");
	}
	
	// static method
	public static void sleep() {
		
		System.out.println("animal sleep");
	}

}
 