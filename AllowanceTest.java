
public class AllowanceTest {
	
	public static void main(String[] args) {
		
		Allowance staff1 = new Allowance("Adewale","Adekunle",5000.00);
		Allowance staff2 = new Allowance("Akinbade","Olatunji",2000.00);

		System.out.println("first name: " + staff1.getFirstName());
		System.out.println();
		System.out.println("last name: " + staff1.getLastName());
		System.out.println();
		System.out.println("salary: " + staff1.getSalary());
		System.out.println("salary increament: " + staff1.incrementOfSalary());

		System.out.println();
		
		System.out.println("first name: " + staff2.getFirstName());
		System.out.println();
		System.out.println("last name: " + staff2.getLastName());
		System.out.println();
		System.out.println("salary: " + staff2.getSalary());
		System.out.println("salary increament: " + staff2.incrementOfSalary());

	}

}
