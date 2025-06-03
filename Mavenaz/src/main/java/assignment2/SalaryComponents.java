package assignment2;

public class SalaryComponents {
	double hra, pf;

    void calculate(double basicPay) {
        hra = basicPay * 0.05; // 5% HRA
        pf = basicPay * 0.20;  // 20% PF
    }
}
