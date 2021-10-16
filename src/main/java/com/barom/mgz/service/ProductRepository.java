package com.barom.mgz.service;

import com.barom.mgz.service.impl.Product;
import org.springframework.context.annotation.Bean;

public interface ProductRepository {

    public Product getProduct(int id);

}
