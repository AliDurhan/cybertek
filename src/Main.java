import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) {

		Book b1 = new Book(1234, "aliCan yApMaz", "kIrmanchi", 99 );
		Book b2 = new Book(7669, "aliCan yApMaz", "kIrmanchi", 99 );
		Book b3 = new Book(7669, "aliCan yApMaz", "kIrmanchi", 99 );
		Book b4 = new Book(7669, "aliCan yApMaz", "kIrmanchi", 99 );
		
		System.out.println(b1.getId());
		System.out.println(Shelf.isIDUnique(1234));
		
		Shelf.addBook(100,"j.K. rowLing","harry potter",556);
		
		Shelf.getTheBooks().get(3);

	}
}