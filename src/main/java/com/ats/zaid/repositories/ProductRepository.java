package com.ats.zaid.repositories;

import com.ats.zaid.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zaid jendoubi on 07/11/2017.
 */
@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
    Page<Product> findByCategory(String category,Pageable p);
    Page<Product> findAll(Pageable p);
}