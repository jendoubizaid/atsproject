package com.ats.zaid;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication

public class AtsProjectApplication{

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(AtsProjectApplication.class, args);
	}

}
