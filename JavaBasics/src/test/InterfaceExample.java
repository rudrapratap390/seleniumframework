package test;


public class InterfaceExample implements InterfaceAnimal {
	
	
	@Override
	public void makeSound() {
		
		System.out.println("Dog barks");
	}
	
	/*
	 * public void eat() {
	 * 
	 * System.out.println("Dog eat meat"); }
	 */

	public static void main(String[] args) {
		
		InterfaceExample dog = new InterfaceExample();		
		dog.eat();
		dog.makeSound();
		InterfaceAnimal.sleep();
		System.out.println(InterfaceAnimal.animalCat);
		
		
		

	}

	

}
