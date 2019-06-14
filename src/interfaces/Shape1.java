package interfaces;

public abstract class Shape1 implements Drawable1{
	
	public String color;
	
	
	public abstract double calculateArea();
	
	public abstract String toString();
	
	public static void main(String[] args) {
		
		System.out.println(DRAWING_TOOL);
		
		System.out.println(Drawable1.DRAWING_TOOL);
		
		System.out.println(Shape1.DRAWING_TOOL);
	}

}
