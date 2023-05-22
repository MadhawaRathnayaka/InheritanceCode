public class Rectangle extends TwoDimensional {
	private float height;
	private float width;
	
	Rectangle(float height, float width) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public float getArea() {
		return height * width;
	}
	
	@Override
	public float getCircumference() {
		return 2 * (height + width);
	}
	
	@Override 
	public String toString() {
		return "Rectangle (height:" + height
		+ ", width:" + width + ")";
	}
}
