package com.dependencyinjection.serv.migratorServ;
import com.dependencyinjection.model.Book;
import com.dependencyinjection.model.User;
import com.dependencyinjection.rep.ReaderBook;
import com.dependencyinjection.rep.WriteBookInBd;
import org.springframework.stereotype.Component;

@Component
public class MigratorOfLoanedBook {
    ReaderBook<Book> reader;
    WriteBookInBd<Book> write;
    public MigratorOfLoanedBook(ReaderBook<Book> reader, WriteBookInBd<Book> write) {
        this.reader = reader;
        this.write = write;
    }
    public void readerWriteAction(){
        //Reading the book
        Book book = reader.read();
        //Writing the book in db
        write.writeBook(book);
        // user take the book to him
        User userTakeBook = new User("Azevedo", 22, "333", book);
        System.out.println("User info: " + userTakeBook);
    }
}