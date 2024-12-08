package superkeyword;

public class SuperChildClass extends SuperInstanceVariable{

	String colour="Green";
	public void display()
	{
		System.out.println("Child class colour:"+colour);
		System.out.println(super.Colour);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChildClass obj=new SuperChildClass();
		obj.display();
	}

}
