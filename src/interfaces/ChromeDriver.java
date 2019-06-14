package interfaces;

import java.util.ArrayList;

public class ChromeDriver implements WebDriver{

	int screenSize;
	double positionX;
	
	public ChromeDriver (int screenSize, double positionX) {
		this.screenSize = screenSize;
		this.positionX = positionX;
		openBrowser();
	}

	public ChromeDriver () {
		
		System.out.println("Opening browser with no arg!");
		openBrowser();
	}
	
	@Override
	public void openBrowser() {
		System.out.println("Browser is openning!");
	}

	@Override
	public void navigateTo(String Url) {
		System.out.println("Navigating to URL!");
		
	}

	@Override
	public void quit() {
		
		System.out.println("Browser is closing!");
		
	}

	@Override
	public String findElementByID(int id) {
		System.out.println("Looking for an element by id");
		return "returning my element";
	}

	@Override
	public ArrayList<String> findElementByTagName(String tagName) {
		System.out.println("Returning an ArrayList Element!");
		
		ArrayList<String> myArrayListElement= new ArrayList();
		myArrayListElement.add("my first element");
		return myArrayListElement;
	}
	

}
