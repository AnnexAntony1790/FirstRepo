package exceptionpackage;

public class ThrowVotingPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=18;
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException ("under age");
		}
	}

}
