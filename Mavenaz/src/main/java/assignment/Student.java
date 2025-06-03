package assignment;


public class Student {
 String name;
 int rollNumber;

 void setStudentDetails(String name, int rollNumber) {
     this.name = name;
     this.rollNumber = rollNumber;
 }

 void displayStudentDetails() {
     System.out.println("Student Name: " + name);
     System.out.println("Roll Number: " + rollNumber);
 }
}

class Address {
 String location;

 void setAddress(String location) {
     this.location = location;
 }

 void displayAddress() {
     System.out.println("Address: " + location);
 }
}


