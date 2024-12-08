package exceptionpackage;

public class throwsEx1 {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub

		int age=15;
		//int age = Integer.parseInt(args[0]);
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new VotingException("under age");
		}
	}

}
