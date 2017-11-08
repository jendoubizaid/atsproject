package com.ats.zaid.controllers;

import com.ats.zaid.entities.Product;
import com.ats.zaid.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by zaid jendoubi on 07/11/2017.
 */
@RestController
public class ProductController {
    @Autowired
    private MongoOperations mongo;

    public MongoOperations getMongo() {
        return mongo;
    }

    public void setMongo(MongoOperations mongo) {
        this.mongo = mongo;
    }
    @Autowired
    ProductRepository productRepository;

    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping("/products")
    public Page<Product> getProducts(@RequestParam(value="page") int page, @RequestParam(value="size") int size){
        return productRepository.findAll(new PageRequest(page,size));
    }
    @RequestMapping("/categories")
    public List<String> getCategories(){
        return mongo.getCollection("products").distinct("category");
    }

    @RequestMapping("/productsByCategory")
    public Page<Product> getProductsByCategory(@RequestParam(value="category") String cat,@RequestParam(value="page") int page, @RequestParam(value="size") int size){
        return productRepository.findByCategory(cat,new PageRequest(page,size));
    }

    @RequestMapping("/productsSortedByRandom")
    public Page<Product> getProductsRandomlySorted(@RequestParam(value="page") int page, @RequestParam(value="size") int size){
        ArrayList<String> sortBy=new ArrayList<String>(Arrays.asList("productName","basePrice","category","brand","productMaterial","delivery","details"));
        int randomItem=new Random().nextInt(sortBy.size());
        //return productRepository.findAll(new Sort(Sort.Direction.ASC,sortBy.get(randomItem))).subList(0,20);
        return productRepository.findAll(new PageRequest(page,size,Sort.Direction.ASC,sortBy.get(randomItem)));
    }
}
