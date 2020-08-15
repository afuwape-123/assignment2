import java.util.Scanner;
public class GirlTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Girl quality1 = new Girl("adewale", "fair");
		Girl quality2 = new Girl("adekkunle", "dark");
		Girl quality3 = new Girl("iclass", "melanie");		
		
		
		System.out.printf(quality1.getName() + " is " + "fair in complextion");
		String quality1name = quality1.getName();
		String quality1complextion = quality1.getComplextion();

		
	
		//System.out.println(quality1name  + "  ïs  " +  " fair in complexion");

	}

}
