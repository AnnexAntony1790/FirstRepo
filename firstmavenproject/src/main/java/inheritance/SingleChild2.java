package inheritance;

public class SingleChild2 extends SingleParent2{
	

	public static void findtotalamt(int price1,int price2)
	{
		int total=price1+price2;
		System.out.println("Total amount:"+total);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleChild2.print();
		SingleChild2.findtotalamt(1000, 2000);

	}

}
