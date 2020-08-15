import java.io.PrintStream;
import java.util.Scanner;
public class Chapter2_ii {
	
	public static void main(String[] args) {
	
		int num1 = 0, num2 = 0, num3 = 0, sum, product = 1, average = 1, smallest=0,largestNumber = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter the second number: ");
		num2 = input.nextInt();
		
		System.out.print("Enter the third number: ");
		num3 = input.nextInt();
		
		sum = num1 + num2 + num3;
		
		product = num1 * num2 * num3;
		
		average = (num1 + num2 + num3)/3;

		System.out.printf("the average is: %d%n",average);
		System.out.printf("the sum is: %d%n",sum);
		System.out.printf("the product is: %d%n",product);

			largestNumber = average;
		
		if(largestNumber < sum) {
			largestNumber = sum;
		}
		
		if(largestNumber < product) {
			largestNumber = product;
		}
		
		

			smallest = average;

		if(smallest > sum) {
			smallest = sum;
		}
		
		if(smallest > product) {
			smallest = product;
		}
		
		
		System.out.printf("largest number: %d%n", largestNumber);

		System.out.printf("smallest number: %d%n", smallest);

		

		
		
		
		
		
		
		
	}
}
