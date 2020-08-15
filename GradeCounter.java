import java.util.Scanner;

public class GradeCounter {
	
	public static void main(String[] args) {
		
		int total = 0;
		int counter = 1;
		int average;
		while(counter <= 10) {
			
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the Grade: ");
			int grade = input.nextInt();
			total += grade;
			counter += 1;
		}
			average = total/10;
			System.out.println();
			System.out.printf("the class total of ten is: %d%n", total);
		
			System.out.printf("the class average of ten is: %d%n", average);

	}

}
