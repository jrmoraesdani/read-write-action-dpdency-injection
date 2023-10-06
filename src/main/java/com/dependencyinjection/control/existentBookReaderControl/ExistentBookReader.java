package com.dependencyinjection.control.existentBookReaderControl;

import com.dependencyinjection.model.Book;
import com.dependencyinjection.rep.ReaderBook;
import org.springframework.stereotype.Component;

@Component
public class ExistentBookReader implements ReaderBook<Book> {
    public Book read(){
        System.out.println("Reading book...");
        return new Book("Neuromancer", "12345");
    }
}