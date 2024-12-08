package accessmodifier;

public class ModifierClass {
	
public static void main(String args[])
{
	ModifierClass obj=new ModifierClass();
	obj.displaypublic();
	obj.displayprivate();
	obj.displayprotected();
	obj.displaydefault();
	
}

public void displaypublic()
{
	System.out.println("This is a public access modifier");
}
private void displayprivate()
{
	System.out.println("This is a private access modifier");
}
protected void displayprotected()
{
	System.out.println("This is a protected access modifier");
}

void displaydefault()
{
	System.out.println("This is a default access modifier");
}

}


