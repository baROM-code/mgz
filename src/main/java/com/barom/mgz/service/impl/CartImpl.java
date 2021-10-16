package com.barom.mgz.service.impl;

import com.barom.mgz.service.Cart;
import com.barom.mgz.service.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("Cart")

public class CartImpl implements Cart {

    @Autowired
    private ProductRepository productRepository;

    private ArrayList<Product> products = new ArrayList<>();

    public CartImpl() {
    }

    @Override
    public void add(int id) {
        this.products.add(productRepository.getProduct(id));
    }

    @Override
    public void del(int id) {
        this.products.remove(productRepository.getProduct(id));
    }

    @Override
    public void show() {
        System.out.println("Cart: " + products);
    }
}
