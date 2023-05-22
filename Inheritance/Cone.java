import java.lang.Math.*;

public class Cone extends ThreeDimensional {
	private static float PI = (float) Math.PI ;
	private float radius;
	private float height;
	
	Cone(float radius, float height) {
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public float getSurface() {
		return 2 * PI * radius * (radius + height);
	}
	
	@Override
	public float getVolume() {
		return (1/3) * PI * radius * radius * height;
	}
	
	@Override 
	public String toString() {
		return "Cone (height:" + height + ", radius:"
			+ radius + ")";
	}
}