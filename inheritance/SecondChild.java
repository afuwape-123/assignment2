package inheritance;

public class SecondChild extends Father {

	public SecondChild(String eyeColor, String height, String skinColor) {
		super(eyeColor, height, skinColor);
	}
	
	@Override
	public void walk() {
		String mannerOfWalking = "bounce";
	}
}
