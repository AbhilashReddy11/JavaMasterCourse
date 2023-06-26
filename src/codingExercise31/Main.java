package codingExercise31;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Person person=new Person();
   person.setFirstName("sreepriya");
   person.setLastName("patel");
   System.out.println(person.getFullName());
   person.setAge(100);
   System.out.println("age is " +person.getAge());
	}

}
