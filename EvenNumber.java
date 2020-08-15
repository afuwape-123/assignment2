import java.util.Scanner;
public class EvenNumber {
	
	public static void main(String[] args) {
		
		int det = 2, num = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		num = input.nextInt();
		
		if(num % det == 0) {
			System.out.println("the num is even");
		}
		
		if(num % det != 0) {
			System.out.println("the num is odd");
		}
	}

}