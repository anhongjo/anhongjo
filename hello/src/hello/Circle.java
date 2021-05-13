package hello;

public class Circle {
	int r;
	
	public Circle() {
		this (5);
	}
	
	public Circle(int r) {
		this.r = r;
		
	}
	
	
	public double getArea() {
        return 3.14 *2 *r;
	}

}