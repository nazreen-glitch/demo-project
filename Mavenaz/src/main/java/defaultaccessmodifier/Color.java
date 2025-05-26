package defaultaccessmodifier;

class Color {
	 void view () {
		System.out.println("the color is purple");
		
	}

	public static void main(String[] args) {
		Color view = new Color();
		view.view();
	}

}
