package oopconcepts;

public class Action {

	public static void main(String[] args) {
		
		c_profits(111,45);

//		Person p1 = new Person("ali", 37, 5.9f, 'm');
//		int peopleCount = Person.counter;
//		Person p2 = new Person("ert", 37, 5.9f, 'm');
//		peopleCount = Person.counter;
//		System.out.println(peopleCount);
//		System.out.println(Person.counter);
//		

	}

	public static String c_profits(int buyPrice, int sellPrice) {

		if (buyPrice > sellPrice) {
			return "profit";
		} else if (buyPrice < sellPrice) {
			return "loss";
		} else {
			return "no loss";
		}

	}

}
