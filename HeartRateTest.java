import java.util.Scanner;
public class HeartRateTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String firstName = input.next();
		
		System.out.print("Enter last name: ");
		String lastName = input.next();
		
		System.out.print("Enter year of birth: ");
		int year = input.nextInt();
		
		System.out.print("Enter month of birth: ");
		int month = input.nextInt();
		
		System.out.print("Enter day of birth: ");
		int day = input.nextInt();
		
		System.out.print("Enter current year: ");
		int currentYear = input.nextInt();
		
		HeartRates client = new HeartRates (firstName,lastName,day,month,year);
		System.out.println("Age: " + client.ageInYears(currentYear));
		System.out.println("max rate: " + client.calculateMaxRate());
		System.out.println("heart rate: " + client.targetHeartRate());
	}

}
