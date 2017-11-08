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
//		ProductRepository productRepository=ctx.getBean(ProductRepository.class);
//		for(Product p:productRepository.findByCategory("Tools")){
//			System.out.println(p.getProductName());
//			Iterator it=p.getReviews().iterator();
//			while (it.hasNext()){
//				Review r=(Review)it.next();
//				System.out.println(r.getRating());
//			}
//		}
//		System.out.println("pagination");
//		int page=1;
//		int size=20;
//		for (Product p:productRepository.findAll(new PageRequest(page,size))) {
//			System.out.println(p.getProductName());
//		}
//		ArrayList<String> sortBy=new ArrayList<String>(Arrays.asList("productName","basePrice","category","brand","productMaterial","delivery","details"));
//		int randomItem=new Random().nextInt(sortBy.size());
//		System.out.println(">>>>>>>>>>>>>>>>sort");
//		for (Product p:productRepository.findAll(new Sort(Sort.Direction.ASC,sortBy.get(randomItem))).subList(0,20)) {
//			System.out.println(p.getBasePrice());
//		}
	}

}
