import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculator2 {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		double num1 = input.nextInt();

		System.out.print("Enter second number: ");
		double num2 = input.nextInt();
		
		String operator;
		Scanner op = new Scanner(System.in);	
		
		System.out.println("What is your operation? ");
		System.out.println("Choose: +  -  /  * ");	
		operator = op.next();
	
		switch (operator) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "/":
			System.out.println(num1 / num2);
			break;
		case "*":
			System.out.println(num1 * num2);
		}	

	}
}
	
