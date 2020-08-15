package inheritance;

public class GrandChild extends FirstChild {
	
	public GrandChild(String eyeColor, String height, String skinColor,String hairColor) {
		super(eyeColor, height, skinColor, hairColor);
	}
	@Override
	public void walk() {
		String mannerOfWalking = "limping";
	}
}
