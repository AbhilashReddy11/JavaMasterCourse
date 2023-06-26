package basics;

public class HelloWorld {
	 public static void main(String[] args) {
	 System.out.println("Hello World");
	 
	 
	 boolean isCar=false;
	 if(!isCar) {// !isCar -> isCar == false
		 System.out.println("Hello World");
		 
	 }
	 String makeOfcar = "bmw";
	 boolean isDomestic = makeOfcar == "bmw"? true:false;
	 if(isDomestic) {// !isCar -> isCar == false
		 System.out.println("car is domestic to our country");
		 
	 }
	 int age = 10;
	 String ageText = age>=18? "adult":"kid";
	 if(isDomestic) {// !isCar -> isCar == false
		 System.out.println("our client is " + ageText);
		 
	 }
	 
	 
	 
	 }
}
