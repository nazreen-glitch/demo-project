package Assignment9;


abstract class Employee {
 String name;
 Employee(String name) {
     this.name = name;
 }
 abstract double calculateSalary();
}
class Contractor extends Employee {
 double hourlyRate;
 int workingHours;

 Contractor(String name, double hourlyRate, int workingHours) {
     super(name);
     this.hourlyRate = hourlyRate;
     this.workingHours = workingHours;
 }

 double calculateSalary() {
     return hourlyRate * workingHours;
 }
}

class FullTimeEmployee extends Employee {
 double hourlyRate;

 FullTimeEmployee(String name, double hourlyRate) {
     super(name);
     this.hourlyRate = hourlyRate;
 }

 
 @Override
 double calculateSalary() {
     return hourlyRate * 8;
 }
}


