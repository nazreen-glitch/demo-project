package encapsulation;

public class MainEncaps {

	public static void main(String[] args) {
		
		Student display = new Student ();
		display.setName("Nazreen");
		display.setAge (25);
		System.out.println(display.getName());
		System.out.println(display.getAge());
	}

}
