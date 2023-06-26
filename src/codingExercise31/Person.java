package codingExercise31;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=100||age<=0) {
			this.age = 0;
		}else
		{
		this.age = age;
		}
	}
	public String getFullName() {
		return firstName+" " +lastName;
		//return this.firstName+" " +this.lastName;
	}
	
	
	

}
