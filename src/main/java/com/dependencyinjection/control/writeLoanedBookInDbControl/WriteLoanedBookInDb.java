package com.dependencyinjection.control.writeLoanedBookInDbControl;

import com.dependencyinjection.model.Book;
import com.dependencyinjection.rep.WriteBookInBd;
import org.springframework.stereotype.Component;

@Component
public class WriteLoanedBookInDb implements WriteBookInBd<Book> {
    public void writeBook(Book items){
        System.out.println("Writing the following loaned book  in database: " + items);
    }
}