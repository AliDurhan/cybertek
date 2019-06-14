package cybertek;

public class StringMethods {

	public static void main(String[] args) {
		
		String test = "This is a test string";
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "mello";
		String s4 = "heblo";
		String s5 = "Hello";
		
/** String length():
		 * - tells the length of the string. 
		 * - returns count of total number of characters present in the String.
		 */
		
		System.out.println("Length method: " + test.length()); // return 21 as there 21 characters
		
/** String compareTo() and compareToIgnoreCase():
		 * - compares the given string with the current string
		 * - takes sting value
		 * - it returns positive number, negative number, or 0 (zero) 
		 */
			
		System.out.println(s1.compareTo(s2)); // returns 0 - zero - because they are equal
		System.out.println(s1.compareTo(s3)); // returns -5 -negative- because "h" is 5 times lower than "m" in ASCII table 
		System.out.println(s1.compareTo(s4)); // returns 10 -positive- because "l" is 10 times greater than "b" in ASCII table
		System.out.println(s1.compareToIgnoreCase(s5)); // returns 0 only because of using "ToIgnoreCase" "H" and "h" are different in ASCII table
		
/** String concat():
		 * - combines a specific string at the end of another one
		 * - returns the combined string
		 */
			
		System.out.println(s1.concat(" how are you?")); 
		s1 = s1.concat(" this is the second concate try"); // this reassigns s1 to concatenated value
		System.out.println(s1); 
		
		
/** String isEmpty():
		 * - checks whether the String contains anything
		 * - returns true or false
		 */
		
		System.out.println(s1.isEmpty()); // returns "false" since it is not empty
		
/** String trim():
		 * - removes the leading and trailing spaces
		 * - checks the unicode value of space character and than removes the spaces before & after the string
		 * - returns the trimmed / omitted string  
		 */
		
		String trim = "    			hello bro            ";
		System.out.println(trim);			// returns with the spaces
		System.out.println(trim.trim());	// returns the trimmed string
		
/** String toLowerCase():
		 * - converts all of the string characters into lowercase
		 * - returns the converted lowercase string
		 */
		
		String lowerCase = "CONVERT THIS TO LOWERCASE";
		System.out.println(lowerCase.toLowerCase()); // prints "convert this to lowercase"
		
/** String toUpperCase():
		 * - converts all of the string characters into UPPERCASE
		 * - returns the converted UPPERCASE string
		 */
		
		String upperCase = "convert this to uppercase";
		System.out.println(upperCase.toUpperCase()); // prints "CONVERT THIS TO UPPERCASE"		
		
/** String valueOf():
		 * - converts different types of values into String
		 * - you can convert these into string: int, long, boolean, character, float, double, object, char array 
		 */
		
		String valueOf = "value";
		int value = 20;
		
		String valueTest = valueOf.valueOf(value);
		System.out.println(valueTest);
		
/** String replace(): - All characters
		 * - replaces all the old characters to new characters
		 * - returns string value
		 */
		
		String replaceTest = "Let's see how you can replace me!";
		String rTest = replaceTest.replace('e', 'a');
		String pNumber = "773 629 9460";
		System.out.println(rTest);
		System.out.println(pNumber.replace(' ', '-'));
		
/** String replace(): - CharSequence or the words
		 * - replaces a CharSequence to new characters
		 * - "ali" to "veli"
		 * - returns string value
		 */
		
		String replaceTest2 = "Ali, can be replaced!";
		String rTest2 = replaceTest2.replace("Ali", "veli"); // it is case sensitive so you need to type "Ali" not "ali"
		System.out.println(rTest2);
		
/** String contains():
		 * - compares to given strings
		 * - returns true or false
		 */
		
		System.out.println(s1.contains("Ali"));		// false - there is no Ali
		System.out.println(s1.contains("hello"));	// true - it includes hello
		System.out.println(s1.contains("Hello"));	// false - case sensitivity 
		
/** String equals() and equalsIgnoreCase(): 
		 *  - compares to given strings
		 *  - returns true or false based on if all the characters match or not
		 */
		
		String h1 = "hello";
		String h2 = "hello";
		String h3 = "Hello";
		
		System.out.println(h1.equals(h2)); // true - they are equal
		System.out.println(h1.equals(h3)); // false - they are not equal because of case sensitivity
		System.out.println(h1.equalsIgnoreCase(h3)); // true - they are equal thanks to IgnoreCase method
		
/** Sting indexOf():
		 * - helps you to find the location of a specific character
		 * - returns the index number as int
		 */
		
		String h4 = "hello, my name is ali";
		System.out.println(h1.indexOf('l')); // returns 2 as 'l' is located in the index box 2
		System.out.println(h4.indexOf("li")); // returns 1 as it takes the first character in "el" - 'e' located in index 1
		System.out.println(h4.indexOf('m', 9)); // returns 12 as it checks for 'm' after the index # 9
		System.out.println(h4.indexOf("my", 3));
		
		
/** String charAt();
		 * - returns char value at the specific index
		 * - from index 0 to .length()-1
		 */
		
		System.out.println(h4.charAt(11)); // returns a since 'a' is the character in index 11
		
/** String substring():
		 * - returns a substring from the given index number
		 * - overloaded method; you can enter start and end index to trim the range
		 */
		
		String subString = h4.substring(7);
		System.out.println(subString); // returns "my name is ali" as started trimming from index 7
		
		String subString2 = h4.substring(7, 14);
		System.out.println(subString2); // returns "my name" as this is between the indexes of 7 - 14 (excludes 14)
		
/** String lastIndexOf():
		 * - returns the last index of specified "character" or "string"
		 * - has 4 overloaded methods
		 * - 
		 */
		
		String lastIndex = "If you judge a fish by its ability to climb a tree, it will live its whole life believing that it is stupid.";
		
		System.out.println(lastIndex.lastIndexOf("its")); // returns 65 which is the index number of "its" where it occurred in the string for the last time
		System.out.println("hello world".lastIndexOf("world")); // returns 6
		System.out.println("hello world stay away from me".lastIndexOf('m')); // returns 27 the index of 'm' at the very end
		System.out.println("hello world stay away from me".lastIndexOf('m', 26)); // returns 25 
		
		String name = "ali kemal";
		int age = 37;
		int zipCode = 63123;
		String education = "Less than High School";
		String referenceNumber = "Reference number: " + name.substring(0, 2) + age + name.substring(name.length()-2) + education.replace(" ", "");
		
		System.out.println("Reference number: " + name.substring(0, 2) + age + name.substring(name.length()-2) + education.replace(" ", "") );
		System.out.println(referenceNumber.toUpperCase());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
