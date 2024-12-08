package exceptionpackage;

public class IndexOutofBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[] {1,2,3,4,5};
		System.out.println(a.length);
		for(int i=0;i<=a.length;i++)
		{		
			System.out.println(a[i]);
		}
	}

}
