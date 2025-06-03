package assignment2;

public class EmployeeInput {
	double basicPay, deduction, bonus;

    void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Basic Pay: ");
        basicPay = scanner.nextDouble();

        System.out.print("Enter Deduction: ");
        deduction = scanner.nextDouble();

        System.out.print("Enter Bonus: ");
        bonus = scanner.nextDouble();
    }
}
