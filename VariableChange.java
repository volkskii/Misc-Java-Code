public class VariableChange {
	public static void main(String[] args) {
		double radius;
		double area;
		
		// Variables represent data that can change
		// datatype variableName = value;
		// Computer first area
		radius = 1.0;
		area = radius * radius * 3.14;
		System.out.println("The area is " + area + " for radius " + radius);

		// Computer second area
		radius = 2.0;
		area = radius * radius * 3.14;
		System.out.println("The area is " + area + " for radius " + radius);

		// Computer third area
		radius = 3.0;
		area = radius * radius * 3.14;
		System.out.println("The area is " + area + " for radius " + radius);

		// Named constant represents permanent data that does not change
		// final datatype constantName = value;
		// Capitalize all constant names
		final double RADIUS = 4.0;
		final double AREA = radius * radius * 3.14;
		System.out.println("The area is " + AREA + " for radius " + RADIUS);

	}
}