package staticKeyword;

public class Main {

	public static void main(String[] args) {
		System.out.println(Dog.genus);
	Dog dog=new Dog();
	dog.genus="new";
	System.out.println(dog.genus);
	Calculator.add(1,2 );
	//Calculator c= new Calculator();
	
	}

}
