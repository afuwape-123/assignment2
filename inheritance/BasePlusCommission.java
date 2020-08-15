package inheritance;

public class BasePlusCommission  extends CommisssionEmployee{

	public BasePlusCommission(String firstName, String lastName,
			int socialSecurityNumber, int earnings, int commission){

		super(firstName, lastName, socialSecurityNumber, earnings,commission);
	}
		
		@Override
		public void incentive() {
			
//			int modeOfPayment = weekly;
			
		}

		@Override
		public String toString() {
			return "BasePlusCommission [getEarnings()=" + getEarnings() + ", getCommission()=" + getCommission()
					+ ", toString()=" + super.toString() + ", getFirstName()=" + getFirstName() + ", getLastName()="
					+ getLastName() + ", getSocialSecurityNumber()=" + getSocialSecurityNumber() + ", getClass()="
					+ getClass() +  "]";
		}
		
		
	
}
