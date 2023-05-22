import java.lang.Math.*;

public class Cylinder extends ThreeDimensional {
	private static float PI = (float) Math.PI ;
	private float radius;
	private float height;
	
	Cylinder(float radius, float height) {
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public float getSurface() {
		return 2 * PI * radius * (radius + height);
	}
	
	@Override
	public float getVolume() {
		return PI * radius * radius * height;
	}
	
	@Override 
	public String toString() {
		return "Cylinder (height:" + height + ", radius:"
			+ radius + ")";
	}
}