package oopconcepts;

public class Human {
		
		private int age;
		private String country;
		private String culture;
		private String language;
		private String color;
		
		
		

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getCulture() {
			return culture;
		}

		public void setCulture(String culture) {
			this.culture = culture;
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public void speaks(String lanugage){
			
			System.out.println("I can speak ");
			
			
		}
		
		public void wasBorn() {
			
			System.out.println("I was born in " + country);
		}
		
		
	

}
