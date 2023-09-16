package com.dependencyinjection;
public class DependencyinjectionApplication {
	public static void main(String[] args) {
		new MigratorOfLoanedBook().readerWriteAction();
	}
}
class MigratorOfLoanedBook {
	ExistentBookReader reader = new ExistentBookReader();
	WriteLoanedBookInDb write = new WriteLoanedBookInDb();
	void readerWriteAction(){
		//Reading the book
		Book book = reader.read();
		//Writing the book in db
		write.writeBook(book);
		// user take the book to him
		User userTakeBook = new User("Azevedo", 22, "333", book);
		System.out.println("User info: " + userTakeBook);
	}
}
record User(String name, int age, String document, Book books){
}
record Book(String name, String identifier){}
class ExistentBookReader{
	Book read(){
		System.out.println("Reading books...");
		return new Book("Neuromancer", "12345");
	}
}
class WriteLoanedBookInDb{
	void writeBook(Book book){
		System.out.println("Writing the following loaned books in database: ");
		System.out.println(book);
	}
}