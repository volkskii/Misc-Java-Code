import java.util.Scanner;

// Converting Fahrenheit to Celsius
public class FahrToCelsius {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter degrees in Fahrenheit: ");
	double fahr = input.nextDouble();
	
	double celsius = (5.0/9) * (fahr - 32);
	System.out.println(fahr + " degrees in Fahrenheit = " + celsius + " degrees in Celsius.");
	}
}
