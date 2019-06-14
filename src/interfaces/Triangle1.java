package interfaces;

public class Triangle1 extends Shape1{
	
	private int hight;
	private int base;
	

	public Triangle1(String color, int hight, int base) {
		this.color = color;
		this.hight = hight;
		this.base = base;
	}
	
	

	public int getHight() {
		return hight;
	}



	public void setHight(int hight) {
		this.hight = hight;
	}



	public int getBase() {
		return base;
	}



	public void setBase(int base) {
		this.base = base;
	}



	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculateArea() {
		return base*hight/2;
		
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
