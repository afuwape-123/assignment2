package inheritance;
import java.util.Scanner;
public class CreditCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the account number: ");
		int	num = input.nextInt();
		
		System.out.print(" balance at the begining: ");
		int beginingBalance = input.nextInt();
		
		System.out.print("items charged for  the month: ");
		int itemCharged = input.nextInt();
		
		System.out.print("Total credit for the month: ");
		int credit = input.nextInt();
		 
		 System.out.print("enter the creditLimit: ");
		 int creditLimit = input.nextInt();
		 
		 	System.out.println();
		
		 int	balance = beginingBalance + itemCharged - credit;
	
		if(balance > creditLimit ) {
			System.out.println("Credit limit exceeded!!!");
		}
		else
			 System.out.println("you have done so well");
	}
}