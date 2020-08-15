import java.util.Scanner;
public class Condition {

	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter the second number: ");
		num2 = input.nextInt();
		
		if(num1 > num2)
			System.out.println("num1 is larger");
		
		if (num2 > num1)
			System.out.println("num2 is larger");
		
		if(num1 == num2)
			System.out.println("num1  equals num2");
		
	}
}
