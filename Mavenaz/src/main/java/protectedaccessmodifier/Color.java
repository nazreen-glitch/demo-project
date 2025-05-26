package protectedaccessmodifier;

public class Color {

protected void display () {
	System.out.println("the name is nazreen");
}
	public static void main(String[] args) {
		Color display = new Color();
		display.display ();
		
	}

}
