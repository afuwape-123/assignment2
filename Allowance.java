
public class Allowance {
	
	private String firstName;
	private String lastName;
	private double salary;
	
	public Allowance(String firstName, String lastName, double salary) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		if(salary > 0.0)
			this.salary = salary;
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

	public double getSalary() {
		 salary = salary * 12;
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double incrementOfSalary() {
	salary = getSalary();
	double newSalary = salary * 0.1;
	 return newSalary;
	}
}
