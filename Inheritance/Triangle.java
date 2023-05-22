public class Triangle extends TwoDimensional {
	private float base;
	private float height;
	
	private float side1;
	private float side2;
	private float side3;
	
	Triangle(float base, float height) {
		this.base = base;
		this.height = height;
	}
	
	Triangle(float base, float height, float side1, float side2, float side3) {
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	@Override
	public float getArea() {
		return 0.5f * base * height;
	}
	
	@Override
	public float getCircumference() {
		return side1 + side2 + side3;
	}
	
	@Override 
	public String toString() {
		return "Triangle (base: " + base + ", height: " + height
				+ " sides: " + side1 + ", " + side2 + ", " + side3 + ")";
	}
}