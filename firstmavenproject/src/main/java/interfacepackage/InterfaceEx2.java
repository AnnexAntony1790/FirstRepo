package interfacepackage;

public class InterfaceEx2 implements InterfaceEx1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceEx2 obj=new InterfaceEx2();
		obj.display();
		obj.display2();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is an interface method");
	}
	
	public void display2()
	{
		System.out.println("This is a class method");
	}
	

}
