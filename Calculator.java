import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculator {

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
	
		if (operator.equals("+"))
			{
				System.out.println(num1 + num2);
			}
		if (operator.equals("-"))
			{
				System.out.println(num1 - num2);
			}
		if (operator.equals("/"))
			{
				System.out.println(num1 / num2);
			}
		if (operator.equals("*"))
			{	
				System.out.println(num1 * num2);
			}
	}
}
	
