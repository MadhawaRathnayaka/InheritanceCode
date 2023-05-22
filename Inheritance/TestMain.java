public class TestMain {
	public static void main(String[] args) {
		ThreeDimensional shape1 = new Box(4.0f, 3.0f, 7.0f);
		System.out.println(shape1);
		System.out.println("Surface: " + shape1.getSurface());
		System.out.println("Volume: " + shape1.getVolume());
		
		System.out.println();
		ThreeDimensional shape2 = new Cone(3.0f, 7.0f);
		System.out.println(shape2);
		System.out.println("Surface: " + shape2.getSurface());
		System.out.println("Volume: " + shape2.getVolume());
		
		System.out.println();
		ThreeDimensional shape3 = new Cylinder(4.0f, 1.0f);
		System.out.println(shape3);
		System.out.println("Surface: " + shape3.getSurface());
		System.out.println("Volume: " + shape3.getVolume());
		
		System.out.println();
		ThreeDimensional shape4 = new Sphere(4.0f);
		System.out.println(shape4);
		System.out.println("Surface: " + shape4.getSurface());
		System.out.println("Volume: " + shape4.getVolume());
		
		System.out.println();
		TwoDimensional shape5 = new Triangle(4.1f, 5.0f, 9.1f, 7.4f, 3.9f);
		System.out.println(shape5);
		System.out.println("Area: " + shape5.getArea());
		System.out.println("Circumference: " + shape5.getCircumference());
		
		System.out.println();
		TwoDimensional shape6 = new Rectangle(7.4f, 3.9f);
		System.out.println(shape6);
		System.out.println("Area: " + shape6.getArea());
		System.out.println("Circumference: " + shape6.getCircumference());
		
		System.out.println();
		TwoDimensional shape7 = new Circle(9.1f);
		System.out.println(shape7);
		System.out.println("Area: " + shape7.getArea());
		System.out.println("Circumference: " + shape7.getCircumference());
	}
}
