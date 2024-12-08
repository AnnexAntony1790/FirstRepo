package inheritance;

public class MultilevelClassC extends MultilevelClassB{

	public void area()
	{
		int l=20;
		int b=20;
		int area=l*b;
		System.out.println("area of rectangle:"+area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelClassC obj=new MultilevelClassC();
		obj.sum();
		obj.subtract();
		obj.area();
		
	}

}
