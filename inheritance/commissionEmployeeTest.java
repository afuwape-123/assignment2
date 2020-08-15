package inheritance;

public class commissionEmployeeTest {
	
	public static void main(String[] args) {
		
		CommisssionEmployee human = new CommisssionEmployee("Adewale", "Akinde", 1234, 3000, 200);
		human.setEarnings(3000);
		human.setCommission(200);
		System.out.println(human.toString());
	}

}
