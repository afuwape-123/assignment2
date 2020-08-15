import java.util.Scanner;
public class Mileage {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int md = 0, gu = 0, tmd = 0, tgu = 0, trips = 0;
		double mpg = 0, tmpg = 0;

		System.out.print("Enter the miles driven: ");
		md = input.nextInt();
		
		while(md != 0) {
			System.out.print("Enter the gallon used: ");
			gu = input.nextInt();
			
			mpg = (double) md/gu;
			
			System.out.print("Enter the mile driven: ");
			md = input.nextInt();
			
			tmd += md;
			
			tgu += gu;
			
			tmpg += (double)mpg;
			trips++;
		}
		System.out.println("the miles per gallon: " + tmpg);

	}

}
