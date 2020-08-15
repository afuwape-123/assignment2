import java.util.Scanner;
public class Exam {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int passed = 0;
		int failed = 0;
		int studentCounter = 1;
		
		while(studentCounter <= 10) {
			
			System.out.print("Ennter result(1 = passed or 2 = failed): ");
			int result = input.nextInt();
		
			if(result == 1)
				passed += 1;
			else
				failed += 1;
			
			studentCounter += 1;
		}
			System.out.printf("passed: %d%n failed: %d%n", passed, failed);
		
			if(passed > 8)
				System.out.println("Bonus to the instructor");
		
	}

}
