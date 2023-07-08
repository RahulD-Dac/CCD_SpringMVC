package com.javaguides.springboot.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaguides.springboot.model.Product;
import com.javaguides.springboot.model.ProductRepository;

@Service
@Transactional
public class ProductService {
 @Autowired
 private ProductRepository repo;
 
 public List<Product> listAll() {
 return repo.findAll();
}
 
public void save(Product product) {
 repo.save(product);
}
 
 public Product get(Integer id) {
 return repo.findById(id).get();
}
 
public void delete(Integer id) {
 repo.deleteById(id);
}
}