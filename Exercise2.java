import java.util.Scanner;
public class Exercise2 {
	
	public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the firstNumber: ");
		a = input.nextInt();
		
		System.out.print("Enter the secondNumber: ");
		b = input.nextInt();
		
		System.out.print("Enter the thridNumber: ");
		c = input.nextInt();
		
	int result = a * b * c;
	
	System.out.printf("the product is: %d%n", result );
	}

}
