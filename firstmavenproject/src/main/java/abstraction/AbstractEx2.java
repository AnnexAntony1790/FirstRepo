package abstraction;

public class AbstractEx2 extends AbstractEx1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEx2 obj=new AbstractEx2();
		obj.display();
		obj.display2();
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("This is an abstract method");
	}

}
