package hello;

public class CircleUser {
	
	public static void main(String[] args) {
		
		Circle myCircle = new Circle(6);
		Circle myCircle2 = new Circle();
		System.out.println(myCircle.getArea());
		System.out.println(myCircle2.getArea());
	}
}