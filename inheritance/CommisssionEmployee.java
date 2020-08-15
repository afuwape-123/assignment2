package inheritance;

public class CommisssionEmployee extends Employee3 {
	 
	private  int earnings;
	private int commission;
	
	public CommisssionEmployee(String firstName, String lastName, 
			int socialSecurityNumber, int earnings, int commission){

		super(firstName, lastName, socialSecurityNumber);
		
	}

	public int getEarnings() {
		return earnings;
	}

	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}
	
	public void incentive() {
		
	}

	@Override
	public String toString() {
		 
		return super.toString()+" CommisssionEmployee [earnings=" + getEarnings() + ", commission=" + getCommission() + "]";
	
	}
	
	
}
