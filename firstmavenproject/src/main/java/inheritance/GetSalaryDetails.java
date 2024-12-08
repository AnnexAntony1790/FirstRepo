package inheritance;

import java.util.Scanner;

public class GetSalaryDetails {
	Scanner in = new Scanner(System.in);
	public int getbasicpay()
	{		
	    System.out.println("Enter basic pay:");
		int a = in.nextInt();		
        return a;
	}
	public int getdeduction()
	{
		System.out.println("Enter deduction:");
        int b = in.nextInt();		
        return b;
   	}
	public int getbonus()
	{
	    System.out.println("Enter Bonus:");
	    int c = in.nextInt();		
	    return c;
	}
	}
