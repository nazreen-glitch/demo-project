package aggregation;

public class Color {
Animal animal;
Color (Animal animal){
	this.animal= animal;
}
public void view (){
	animal.display();
	System.out.println ("the color is purple");
	
}
}
