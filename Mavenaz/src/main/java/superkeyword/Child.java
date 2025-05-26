package superkeyword;

public class Child extends Parent {
	public void view () {
		System.out.println ("the color is pink");

	}
public void display () {
	System.out.println("the sky is blue");
}
public void run () {
	super.view ();
display();
}
}
