package inheritance;

public class CalculatePay extends GetSalaryDetails{

	
	public int calcpay(int a)
	{
		//calc hra=5% of basic pay
		int hra=(5*a)/100;
		//System.out.println("Hra:"+hra);
		return hra;
		
	}
	public int calcpf(int a)
	{
		int pf=(20*a)/100;
		//System.out.println("Pf:"+pf);
		return pf;
	}
	
	
}
