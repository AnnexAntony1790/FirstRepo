package interfacepackage;

public class IntefaceChild implements MultipleInParent1,MultipleInParent2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntefaceChild obj=new IntefaceChild();
		obj.display1();
		obj.display2();
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("This is parent2 method");
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("This is parent1 method");
	}

}
