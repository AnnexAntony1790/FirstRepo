package inheritance;

public class SingleChild1 extends SingleParent1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleChild1 obj=new SingleChild1();
		
		obj.display();
		obj.welcome();
	}
	public void welcome()
	{
		String a="Welcome";
		System.out.println(a);
	}

}
