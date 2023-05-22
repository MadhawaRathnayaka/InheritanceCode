import java.lang.Math.*;

public class Sphere extends ThreeDimensional {
	private float radius;
	private static float PI = (float) Math.PI ;
	
	Sphere(float radius) {
		this.radius = radius;
	}
	
	@Override
	public float getSurface() {
		return 4 * PI * radius * radius;
	}
	
	@Override
	public float getVolume() {
		return (4/3) * PI * radius * radius * radius;
	}
	
	@Override 
	public String toString() {
		return "Cylinder (radius:" + radius + ")";
	}
}