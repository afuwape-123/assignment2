
public class SparePart {
	
	private String name;
	private String partDiscription;
	private String partNumber;
	private int quantityOfItem;
	private double pricePerItem;
	
	public SparePart(String name, String partDiscription,String partNumber,int quantityOfItem,double pricePerItem) {
		
		this.name = name;
		this.partDiscription = partDiscription;
		this.partNumber = partNumber;
		
		if(quantityOfItem > 0)
			this.quantityOfItem = quantityOfItem;
		
		if(pricePerItem > 0.0)
			this.pricePerItem = pricePerItem;

		}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDiscription() {
		return partDiscription;
	}

	public void setPartDiscription(String partDiscription) {
		this.partDiscription = partDiscription;
	}

	public int getQuantityOfItem() {
		return quantityOfItem;
	}

	public void setQuantityOfItem(int quantityOfItem) {
		this.quantityOfItem = quantityOfItem;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	public double getInvoiceAmount() {
		double amount = quantityOfItem * pricePerItem;
		
		return amount;
	}
}
