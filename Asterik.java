import java.util.Scanner;
public class Asterik {
	
	public static void main(String[] args) {
	
		int num1 = 0,num2 = 0,num3 = 0,num4 = 0, num5 = 0;
		int largestNum;
		int smallestNum;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		 num1 = input.nextInt();
		 largestNum = num1;
		 smallestNum = num1;
		
		System.out.print("Enter the second number: ");
		 num2 = input.nextInt();
		 
		if(num2 > largestNum) {
			largestNum = num2;
		}
		
		if(num2 < smallestNum) {
			smallestNum = num2;
		}
		System.out.print("Enter the third number: ");
		num3 = input.nextInt();
		if(num3 > largestNum) {
			largestNum = num3;
		}
		
		if(num3 < smallestNum) {
			smallestNum = num3;
		}

		System.out.print("Enter the fourth number: ");
	    num4 = input.nextInt();
	    if(num4 > largestNum) {
			largestNum = num4;
		}
		
		if(num4 < smallestNum) {
			smallestNum = num4;
		}

		System.out.print("Enter the fifth number: ");
	    num5 = input.nextInt();
	    if(num5 > largestNum) {
			largestNum = num5;
		}
		
		if(num5 < smallestNum) {
			smallestNum = num5;
		}
		
		System.out.println();
		System.out.println("Largest " + largestNum);
		System.out.println("smallest " + smallestNum);

		
	}
}