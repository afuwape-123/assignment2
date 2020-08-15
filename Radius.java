import java.util.Scanner;
public class Radius {
	
	public static void main(String[] args) {
		
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		int radius = input.nextInt();

		
		System.out.printf("the diameter is: %d%n", (2 * radius));
		
		System.out.printf("the circumference is: %.2f%n", (2 * Math.PI * radius));
		System.out.printf("the area is: %.2f%n", (2 * Math.PI * radius * radius));
	}

}
