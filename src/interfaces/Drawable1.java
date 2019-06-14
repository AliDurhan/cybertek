package interfaces;

public interface Drawable1 {
	
	public static final String DRAWING_TOOL = "Brush";
	
	public abstract void draw ();
	
	public default void drawLine (int lineCount) {
		
		System.out.println("Drawing " + lineCount + " line(s)" );
	}
	
	public static void printDrawingTool () {
		System.out.println("My tool is " + DRAWING_TOOL);
		
	}
	

}
