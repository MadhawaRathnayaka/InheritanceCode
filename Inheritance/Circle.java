import java.lang.Math.*;

public class Circle extends TwoDimensional {
	private static float PI = (float) Math.PI ;
	private float radius;
	
	Circle(float radius) {
		this.radius = radius;
	}
	
	@Override
	public float getArea() {
		return PI * radius * radius;
	}
	
	@Override
	public float getCircumference() {
		return 2 * PI * radius;
	}
	
	@Override 
	public String toString() {
		return "Circle (radius:" + radius + ")";
	}
}