package assignment2;

public class SalarySlip {

	   public static void main(String[] args) {
	        EmployeeInput emp = new EmployeeInput();
	        emp.getInput();

	        SalaryComponents comp = new SalaryComponents();
	        comp.calculate(emp.basicPay);

	        double totalSalary = emp.basicPay + comp.hra - comp.pf - emp.deduction + emp.bonus;

	        // Print salary slip
	        System.out.println("\n------ SALARY SLIP ------");
	        System.out.println("Basic Pay   : Rs. " + emp.basicPay);
	        System.out.println("Deduction   : Rs. " + emp.deduction);
	        System.out.println("HRA         : Rs. " + comp.hra);
	        System.out.println("PF          : Rs. " + comp.pf);
	        System.out.println("Bonus       : Rs. " + emp.bonus);
	        System.out.println("-------------------------");
	        System.out.println("Total Salary by Hand: Rs. " + totalSalary);
	    }
	}
