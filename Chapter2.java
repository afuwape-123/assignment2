import java.util.Scanner;
public class Chapter2 {
	
	public static void main(String[] args) {
	
		int num1 = 0;
		int num2 = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter number: ");
		num2 = input.nextInt();
		
		if(num1 == num2)
			System.out.printf("%d == %d%n", num1, num2);
		
		if(num1 != num2)
			System.out.printf("%d != %d%n", num1, num2);
		
		if(num1 < num2)
			System.out.printf("%d < %d%n", num1, num2);
		
		if(num1 <= num2)
			System.out.printf("%d <= %d%n", num1, num2);
		
		if(num1 > num2)
			System.out.printf("%d > %d%n", num1, num2);
		
		if(num1 >= num2)
			System.out.printf("%d >= %d%n", num1, num2);
	}

}
