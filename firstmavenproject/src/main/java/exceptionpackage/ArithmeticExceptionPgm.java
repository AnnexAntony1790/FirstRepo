package exceptionpackage;

public class ArithmeticExceptionPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=0;
System.out.println("Hi");
try
{
int c=a/b;
System.out.println("Sum="+c);
}
catch(Exception e)
{
	int c=a+b;
	System.out.println(c);
	System.out.println(e);
}finally
{
	System.out.println("Execution completed successfully");
}
	}

}
