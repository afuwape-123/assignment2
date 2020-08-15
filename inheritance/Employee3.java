package inheritance;

public class Employee3 {
	
	private  String firstName;
	private String lastName;
	private int socialSecurityNumber;
	
	public Employee3(String firstName, String lastName, int socialSecurityNumber){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "Employee3 [firstName=" + firstName + ", lastName=" + lastName + ", socialSecurityNumber="
				+ socialSecurityNumber + "]";
	}
	
	

}
