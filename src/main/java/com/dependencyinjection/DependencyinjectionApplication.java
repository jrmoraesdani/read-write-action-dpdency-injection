package com.dependencyinjection;

import com.dependencyinjection.control.existentBookReaderControl.ExistentBookReader;
import com.dependencyinjection.control.writeLoanedBookInDbControl.WriteLoanedBookInDb;
import com.dependencyinjection.serv.migratorServ.MigratorOfLoanedBook;

public class DependencyinjectionApplication {

	public static void main(String[] args) {
		new MigratorOfLoanedBook(
				new ExistentBookReader(),
				new WriteLoanedBookInDb()).readerWriteAction();
	}
}
