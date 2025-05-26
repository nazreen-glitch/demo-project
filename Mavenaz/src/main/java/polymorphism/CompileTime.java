package polymorphism;

public class CompileTime {
	public void display (String name){
		System.out.println(name);
		
	}
public void display (int age) {
	System.out.println(age);
}
public void display (String name, int age) {
	System.out.println(name+" "+age);
}
	public static void main(String[] args) {
	CompileTime view = new CompileTime() ;
	view.display("nazreen");
	view.display(25);
	view.display ("nazreen", 25);
	}

}

