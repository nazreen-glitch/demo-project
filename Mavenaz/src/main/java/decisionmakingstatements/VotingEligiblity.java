package decisionmakingstatements;

public class VotingEligiblity {

	public static void main(String[] args) {
		int age = 15;
		if (age>=18) {
			System.out.println("the person is eligible to vote");
		
		}
		else {
			throw new ArithmeticException("age is under 18!!!");
		}

	}
}
