package aggregation;

public class BookDetails {
	String bookname;
	int id;
	AuthorDetails ref;
	public BookDetails(String bookname,int id,AuthorDetails ref)
	{
		this.bookname=bookname;
		this.id=id;
		this.ref=ref;		
	}
	public void display()
	{
		System.out.println(ref.name+" "+ref.age);
		System.out.println(bookname+" "+id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuthorDetails obj=new AuthorDetails("Anu", 25);
		BookDetails obj1=new BookDetails("My Book", 7, obj);
		obj1.display();
	}

}
