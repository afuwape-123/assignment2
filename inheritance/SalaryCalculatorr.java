package inheritance;
import java.util.Scanner;
public class SalaryCalculatorr {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double salary =0;
		System.out.print("Enter the name: ");
		String person = input.next();
		
		//while(!(person.equals("none"))) {
		while(true) {
		System.out.print("Enter the number of item1 sold: ");
		int value1 = input.nextInt();
		
		System.out.print("Enter the number of item2 sold: ");
		int value2 = input.nextInt();
		
		System.out.print("Enter the number of item3 sold: ");
		int value3 = input.nextInt();
		
		System.out.print("Enter the number of item4 sold: ");
		int value4 = input.nextInt();
		
		double salesA = 239.99 * value1;
		double salesB = 129.75 * value2;
		double salesC = 99.95 * value3;
		double salesD = 350.89 * value4;
		
		double grossSales = salesA + salesB + salesC + salesD;
		
		salary = 200 +(0.09 * grossSales);
		System.out.println();
		System.out.printf("The weekly Salary of "+person+" :"+salary+"%n");
		System.out.println();
		System.out.print("Enter the name: ");
		person = input.next();
		if(person.equals("none")) {
			break;
		}
		}
		
		
//		System.out.print("Enter the number of item4 sold: ");
//		int number = input.nextInt();
//		System.out.print("Enter a negative number to terminate");
//		while(number > 0) {
			
		}
		
		
	}

