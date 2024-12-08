package polymorphism;

public class ChildClass2  extends ParentClass2{

	
	public void display(String a,int b)
	{
		super.display("Anu", 400);
		System.out.println("Name:"+a+" "+"Marks:"+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass2 obj=new ChildClass2();
		obj.display("Anu", 10);

	}

}
