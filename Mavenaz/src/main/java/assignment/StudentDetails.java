package assignment;

public class StudentDetails {
	 public static void main(String[] args) {
	  
	     Student student = new Student();
	     Address address = new Address();

	  
	     student.setStudentDetails("Nazreen", 23456);
	     address.setAddress("College Road, Tirupur");

	   
	     student.displayStudentDetails();
	     address.displayAddress();
	 }
	}
