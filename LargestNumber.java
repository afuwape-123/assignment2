import java.util.Scanner;
public class LargestNumber {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		int largestNumber = 0;	
		int counter = 0;
		
		while(counter < 10) {
			 System.out.print("Enter number : ");
			 num = input.nextInt();

		if(num > largestNumber)
			largestNumber = num;
		
		counter += 1;
		}
		System.out.printf("the largest number is: %d%n", largestNumber);
	

}
}