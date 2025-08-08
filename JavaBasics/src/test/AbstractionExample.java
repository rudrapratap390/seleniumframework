package test;

//Abstraction 
/*
 * It is the  concept of hiding complex implementation details and showing only what is needed 
 * 
 * focuses on what it does and  not on how it does
 * acheived by class and interfaces  
 */

abstract class Animal{
	
	private String name;
	abstract void makesSound();
	
	
	Animal(String name){
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name + "eat");
	}
}

class Dog extends Animal{

	Dog(String name) {
		super(name);
		
	}

	@Override
	void makesSound() {
		
		System.out.println("Dog barks");
		
	}
	
}


public class AbstractionExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Dog");
		dog.makesSound();
		dog.eat();
		

	}

}
