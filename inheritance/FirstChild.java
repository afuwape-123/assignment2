package inheritance;

public class FirstChild extends Father {
	
	private  String hairColor;
	
	public FirstChild(String eyeColor, String height, String skinColor,String hairColor) {
		super(eyeColor, height, skinColor);
		
		this.hairColor = hairColor;
	}
	
	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	@Override
	public void walk() {
		
	}

}
