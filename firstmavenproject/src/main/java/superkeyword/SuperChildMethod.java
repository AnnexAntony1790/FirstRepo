package superkeyword;

public class SuperChildMethod extends SuperParentInstance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChildMethod obj=new SuperChildMethod();
		obj.displaychild();
		
	}
	public void displaychild()
	{
		super.display();
		System.out.println("This is child class method");
	
	}
}
