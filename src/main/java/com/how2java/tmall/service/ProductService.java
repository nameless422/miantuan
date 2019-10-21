package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List list(int cid);
    void delete(int id);
    void update(Product product);
    Product get(int id);
    void setFirstProductImage(Product p);
}
