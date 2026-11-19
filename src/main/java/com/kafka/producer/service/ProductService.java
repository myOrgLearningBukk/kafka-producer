package com.kafka.producer.service;

import com.kafka.producer.dto.Product;

public interface ProductService {
    String sendMessage(Product product);
}