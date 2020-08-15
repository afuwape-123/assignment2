
public class HeartRates {
	
	private String firstName;
	private String lastName;
	private int month;
	private int day;
	private int year;
	private int currentYear;
	private int age;
	private int maxRate;
	private int thr;
	
	public HeartRates(String firstName,String lastName,int day,int month,int year) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		if(day > 0 && day < 32)
			this.day = day;
		
		if(month > 0 && month < 13)
			this.month = month;
		
		if(year > 0)
			this.year = year;
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

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int ageInYears( int currentYear) {
	age = currentYear - year;
		return age;
	}
	
	public int calculateMaxRate() {
		maxRate = 220 - age;
		
		return maxRate;
		}
	
	public int targetHeartRate() {
		
		thr = maxRate/50 * 100;
		
		return thr;
	}
}
