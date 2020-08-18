package inheritance;
import java.util.Scanner;
public class Smallest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		

		System.out.print("Enter the number: ");
		int smallest = input.nextInt();
		while(counter < 9) {
			System.out.print("Enter the next number: ");
			int number = input.nextInt();
		
		
			if(number < smallest)
			
				smallest = number;
		
			counter++;
		}
		System.out.printf("the smallest number is: %d%n", smallest);
		
		
	}
}
