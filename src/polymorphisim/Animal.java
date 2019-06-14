package polymorphisim;

public abstract class Animal {
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public static void main(String[] args) {
		
		Animal [] arr = {new Dog(), new Horse(), new Dog(), new Cat()};
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i].eat();
			
		}
		
		
	}

}
