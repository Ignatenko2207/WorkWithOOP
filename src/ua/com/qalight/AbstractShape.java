package ua.com.qalight;

public abstract class AbstractShape implements Shape{

	@Override
	public abstract double getArea();
	
	public void someMethod() {
		System.out.println("HI THERE!!!");
	}
	
}
