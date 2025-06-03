package Assignment9;

interface RBI {
 double INTEREST_RATE = 6.5;

 void recurringDeposit(double amount, int duration);
}

class HDFC implements RBI {

 public void recurringDeposit(double amount, int duration) {
     double maturityAmount = amount * duration 
             + (amount * duration * (duration + 1) * INTEREST_RATE) / (2 * 12 * 100);

     System.out.println("Maturity amount after " + duration + " months: ₹" + maturityAmount);
 }

 public static void main(String[] args) {
     HDFC customer = new HDFC();
     double depositAmount = 1000; 
     int months = 12;           

     customer.recurringDeposit(depositAmount, months);

	 
 }
	
 }
	 
	 
 }
