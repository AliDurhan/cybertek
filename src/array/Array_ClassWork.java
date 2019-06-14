package array;

public class Array_ClassWork {

	public static void main(String[] args) {
		
		String [] movie = {"Al yamalim", "Inek Saban", "Malkocoglu", "Belalim"};
		
		for (int i =0; i <movie.length; i++) {
			System.out.println("Movie Name: " + movie[i]);
		}
		
		System.out.println(movie.length);
		
		System.out.println(movie[0].length());

	}

}
