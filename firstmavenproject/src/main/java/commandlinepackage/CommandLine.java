package commandlinepackage;

import java.util.Scanner;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Scanner in=new Scanner(System.in);
	   System.out.print("Enter your name: ");    
       String name = in.next();  
       System.out.println("You entered:"+name);
       System.out.print("Enter your age: ");  
       int i = in.nextInt();  
       System.out.println("Age: " + i);  
       System.out.print("Enter your salary: ");  
       double d = in.nextDouble();  
       System.out.println("Salary: " + d);         
       in.close();           
	}

}
