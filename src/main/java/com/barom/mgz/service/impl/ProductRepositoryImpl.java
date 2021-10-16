package com.barom.mgz.service.impl;

import com.barom.mgz.service.ProductRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;


@Service("ProductRepository")
public class ProductRepositoryImpl implements ProductRepository {

    private ArrayList<Product> products = new ArrayList<>();

    public ProductRepositoryImpl() {

    }

    @PostConstruct
    public void init() {
        for (int i = 1; i <= 5; i++) {
            this.products.add(new Product(i));
        }
        System.out.println(products.toString());
    }

    public Product getProduct(int id) {
        return products.get(id - 1);
    }
}
