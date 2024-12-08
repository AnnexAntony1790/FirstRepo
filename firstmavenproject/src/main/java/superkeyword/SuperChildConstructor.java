package superkeyword;

public class SuperChildConstructor extends SuperParentConstructor {
	
public SuperChildConstructor()
{
	super(10,20);
	System.out.println("This is Child Constructor");
}
public SuperChildConstructor(int a,int b)
{
	super();
	int c=a-b;
	System.out.println("Child Constructor"+c);
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	SuperChildConstructor obj=new SuperChildConstructor();
	SuperChildConstructor obj1=new SuperChildConstructor(30,10);
	}

}
