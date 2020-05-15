package assignmentone;

public class Book{
	private String  bookName,
                        ISBN,
                        author;
        private double   price;
	public Book(String bookName, String ISBN, String author, double price)
	{
		this.bookName = bookName;
		this.ISBN = ISBN ;
                this.author = author;
                this.price=price;
	}
	public void getbookName()
	{
		System.out.println("Enter a Book Name: "+bookName);
	}
	public void getISBN()
	{
		System.out.println("Entere ISBN: "+ISBN);
	}
        public void getauthor()
	{
		System.out.println("Enter Author Name: "+author);
	}
	public void getprice()
	{
		System.out.println("Enter Price "+price);
	}
	 public static void main(String[] args) {
	 	Book b1=new Book("java","12-34-56-7","abc",1200.00);
	 	b1.getbookName();
	 	b1.getISBN();
                b1.getauthor();
	 	b1.getprice();
	}
}
