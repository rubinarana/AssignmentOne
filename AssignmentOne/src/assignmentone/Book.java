package assignmentone;

public class Book{
	private String  BookName,
                        ISBN,
                        Author,
                  Price;
	public Book(String BookName, String ISBN,String Author, String Price)
	{
		this.BookName = BookName;
		this.ISBN = ISBN ;
                this.Author = Author;
                this.Price=Price;
	}
	public void getBookName()
	{
		System.out.println("Enter a BookName: "+BookName);
	}
	public void getISBN()
	{
		System.out.println("Entere ISBN: "+ISBN);
	}
        public void getAuthor()
	{
		System.out.println("Enter AuthorName: "+Author);
	}
	public void getPrice()
	{
		System.out.println("Enter Price "+Price);
	}
	 public static void main(String[] args) {
	 	Book b1=new Book("java","12-34-56-7","abc","1200.00");
	 	b1.getBookName();
	 	b1.getISBN();
                b1.getAuthor();
	 	b1.getPrice();
	}
}

//package assignmentone;
//
//import java.util.Scanner;
//
// class book {
//	private String BookName,
//                ISBN,
//                Author,
//                Price;
//        
//        book()
//	{}
//        //setter
//        public void setBookName(String bookName) {
//            this.BookName = bookName;
//        }
//          public void setISBN(String ISBN) {
//            this.ISBN = ISBN ;
//        }
//        public void setAuthor(String author) {
//           this.Author = author;
//        }
//        public void setPrice(String price) {
//            this.Price =price;
//        }
//       
//        //getter
//	public String getBookName()
//	{
//		return BookName;
//	}
//	public String getISBN()
//	{
//		return ISBN;
//	}
//        public String getAuthor()
//	{
//		return Author;
//	}
//	public String getPrice()
//	{
//		return Price;
//	}
//}
//
//public class Book {
//public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    String bookName=null;
//    String ISBN=null;
//    String author=null;
//    Double price=null;
//    
//    System.out.println("Enter book name:");
//    bookName=sc.nextLine();
//    System.out.println("Enter ISBN:");
//    ISBN=sc.nextLine();
//    System.out.println("Enter author name:");
//    author=sc.nextLine();
//    System.out.println("Enter price:");
//    price=sc.nextDouble();
//         
//    Book b=new Book();
//    b.setBookName(bookName);       
//    b.setISBN(ISBN);
//    b.setAuthor(author);
//    b.setPrice(price);
//   
//    System.out.println("Book Name"+b.getBookName());
//    System.out.println("Book ISBN"+b.getISBN());
//    System.out.println("Book Author"+b.getAuthor());  
//    System.out.println("Book price"+b.getPrice());      
//}
//}
