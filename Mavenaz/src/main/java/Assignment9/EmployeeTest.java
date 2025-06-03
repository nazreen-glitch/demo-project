package Assignment9;

public class EmployeeTest {
    public static void main(String[] args) {
        Contractor contractor = new Contractor("Nazreen", 50.0, 6);
        FullTimeEmployee fullTime = new FullTimeEmployee("Zayaan", 40.0);

        System.out.println(contractor.name + "'s Salary: $" + contractor.calculateSalary());
        System.out.println(fullTime.name + "'s Salary: $" + fullTime.calculateSalary());
    }
}
