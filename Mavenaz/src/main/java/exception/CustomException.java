package exception;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		int a = 12;
		if (a>=18) {
			System.out.println("the person is eligible");
		
		}
		else {
			throw new VotingException ("age under 18");
		}

	}

}
