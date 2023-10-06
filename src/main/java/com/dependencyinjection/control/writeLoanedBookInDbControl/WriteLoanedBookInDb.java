package com.dependencyinjection.control.writeLoanedBookInDbControl;

import com.dependencyinjection.model.Book;
import com.dependencyinjection.rep.WriteBookInBd;

public class WriteLoanedBookInDb implements WriteBookInBd<Book> {
    public void writeBook(Book items){
        System.out.println("Writing the following loaned book  in database: " + items);
    }
}