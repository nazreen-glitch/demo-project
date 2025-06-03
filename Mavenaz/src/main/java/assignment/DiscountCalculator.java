package assignment;

public class DiscountCalculator {

	    public static void main(String[] args) {
	        double price = 1000.0;

	       
	        Onseason on = new Onseason();
	        Offseason off = new Offseason();

	   
	        double onseasonDiscount = on.discount(price);
	        double offseasonDiscount = off.discount(price);

	    
	        System.out.println("Onseason discount for Rs." + price + ": Rs." + onseasonDiscount);
	        System.out.println("Offseason discount for Rs." + price + ": Rs." + offseasonDiscount);
	
	}
}
