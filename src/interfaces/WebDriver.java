package interfaces;

import java.util.ArrayList;

public interface WebDriver {
	
	public static final String PURPOSE = "Automating Browser";
			
			public abstract void openBrowser ();
			
			public abstract void navigateTo (String Url);
			
			public abstract void quit();
		
			public abstract String findElementByID(int id);
			
			public abstract ArrayList<String> findElementByTagName(String tagName);
			

}
