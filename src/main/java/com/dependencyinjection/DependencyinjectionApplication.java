package com.dependencyinjection;

import com.dependencyinjection.serv.migratorServ.MigratorOfLoanedBook;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependencyinjectionApplication {
	public static void main(String[] args) {SpringApplication.run(DependencyinjectionApplication.class, args);}
	@Bean
	ApplicationRunner runner(MigratorOfLoanedBook migratorOfLoanedBook){
		return args -> {
			migratorOfLoanedBook.readerWriteAction();
		};
	}
}
