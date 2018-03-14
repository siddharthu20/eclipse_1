package MyJavaPrograms_1;

import java.util.ArrayList;
import java.util.Iterator;

class Book
{
	int price;
	String name;
	int pages;
    
    
    Book(int price,String name,int pages)
    {	
    	this.price = price;
    	this.name=name;	
    	this.pages=pages;		
    }	
}

public class CollectionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new Book(23,"The mads in heaven",200);
		Book b2 = new Book(25,"Island Treasury",300);
		Book b3 = new Book(27,"Watery heart",400);
		
		ArrayList<Book> al = new ArrayList<Book>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		
		Iterator<Book> itr1 = al.iterator();
		while(itr1.hasNext())
		{
			Book book = itr1.next();
			System.out.println("Book price is: "+book.price);
			System.out.println("Number of pages in the book are: "+book.pages);
			System.out.println("The book name is: "+book.name);	
		}
	}
}
