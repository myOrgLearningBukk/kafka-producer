package com.kafka.producer.controller;

import com.kafka.producer.dto.Product;
import com.kafka.producer.service.ProductService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    private final ProductService productService;

    ProducerController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/product")
    public String sendProduct(@RequestBody Product product) {
        return productService.sendMessage(product);
    }
}
