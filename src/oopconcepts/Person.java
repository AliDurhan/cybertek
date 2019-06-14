package oopconcepts;

public class Person {
	
	protected String name;
	private int age;
	private float height;
	private char gender;
	static int counter;


	public Person(String name, int age, float height, char gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
		
		counter++;
		//System.out.println("Object "+ counter +" counter = "+counter);
		
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", gender=" + gender + "]";
	}
	
	




	
	

}
