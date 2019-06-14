package oopconcepts;

public class HumanDemoMain {

	public static void main(String[] args) {
		
		Human Ali = new Human();
		
		Ali.setAge(37);
		Ali.setCountry("Turkey");
		Ali.setCulture("Turkish");
		Ali.setLanguage("Turkish");
		
		System.out.println(Ali.getAge() + Ali.getCountry() + Ali.getLanguage());
		
//		System.out.println(Ali.speaks());

	}

}
