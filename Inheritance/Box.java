public class Box extends ThreeDimensional {
	private float height;
	private float width;
	private float length;
	
	Box(float height, float width, float length) {
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	@Override
	public float getSurface() {
		return 2 * (height*width + width*length + length*height);
	}
	
	@Override
	public float getVolume() {
		return height * width * length;
	}
	
	@Override 
	public String toString() {
		return "Box (height:" + height + ", width:"
			+ width + ", length:" + length + ")";
	}
}