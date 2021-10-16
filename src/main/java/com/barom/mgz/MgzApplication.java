package com.barom.mgz;

import com.barom.mgz.config.myconf;
import com.barom.mgz.service.Cart;
import com.barom.mgz.service.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// @SpringBootApplication
public class MgzApplication {

    public static void main(String[] args) {
        // SpringApplication.run(MgzApplication.class, args);
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(myconf.class)) {
            ProductRepository productRepository = context.getBean("ProductRepository", ProductRepository.class);
            Cart cart = context.getBean("Cart", Cart.class);

            cart.add(3);
            cart.add(5);
            cart.show();

            cart.del(5);
            cart.show();
        }
    }

}
