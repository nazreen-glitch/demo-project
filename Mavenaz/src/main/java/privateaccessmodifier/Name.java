package privateaccessmodifier;

public class Name {
private String name = "nazreen";
private void display () {
	System.out.println ("the name is nazreen");
}
public static void main(String[] args) {
Name display = new Name ();
display.display();
System.out.println (display.name);
}


	}

