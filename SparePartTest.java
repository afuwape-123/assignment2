
public class SparePartTest {
	
	public static void main(String[] args) {
		
		SparePart customer1 = new SparePart ("ADEWALE ENTERPRISE", "spanner", "0123", 340, 500.00);
		SparePart customer2 = new SparePart ("TRIX VENTURE", "oil filter", "0343", 450, 400.00);

			System.out.println(customer1.getName());
			System.out.println();
			System.out.println("spare part: " + customer1.getPartDiscription());
			System.out.println();
			System.out.println("part number: " + customer1.getPartNumber());
			System.out.println();
			System.out.println("quantity: " + customer1.getQuantityOfItem());
			System.out.println();
			System.out.println("amount: " + customer1.getInvoiceAmount());
			
			System.out.println();
			System.out.println(customer2.getName());
			System.out.println();
			System.out.println("spare part: " + customer2.getPartDiscription());
			System.out.println();
			System.out.println("part number: " + customer2.getPartNumber());
			System.out.println();
			System.out.println("quantity: " + customer2.getQuantityOfItem());
			System.out.println();
			System.out.println("amount: " + customer2.getInvoiceAmount());

	}

}
