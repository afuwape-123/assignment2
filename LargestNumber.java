import java.util.Scanner;
public class LargestNumber {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		int largestNumber = 0;
		
		
		 
		for(int counter = 0; counter <= 10; counter++);
			 
			 System.out.print("Enter the unit: ");
			 int unit = input.nextInt();

		if(num > largestNumber)
			largestNumber += num;
		
		System.out.printf("the largest number is: %d%n", largestNumber);
	}

}
