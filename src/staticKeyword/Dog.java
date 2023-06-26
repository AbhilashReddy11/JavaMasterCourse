package staticKeyword;

public class Dog{
	static String genus="Canis";
	void printData() {
		
		Dog d=new Dog();
		System.out.println(d.genus);
		System.out.println(Dog.genus);
		
		
	}
	
}
  class Calculator{
	 static void add(int a ,int b) {
		 System.out.println(a+b);
	 }
 }