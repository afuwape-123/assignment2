package inheritance;

public class Father {
	
	private String eyeColor;
	private String height;
	private String skinColor;
	private House bungalow;
	
	public Father(String eyeColor, String height, String skinColor) {
		
		this.eyeColor = eyeColor;
		this.height = height;
		this.skinColor = skinColor;
	}


	public String getEyeColor() {
		return eyeColor;
	}


	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}


	public String getHeight() {
		return height;
	}


	public void setHeight(String height) {
		this.height = height;
	}


	public String getSkinColor() {
		return skinColor;
	}


	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}
	
	public void walk() {
		
	}

}
