package com.kafka.producer.service;

import com.kafka.producer.dto.Product;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final KafkaTemplate<String, Product> kafkaTemplate;

    public ProductServiceImpl(KafkaTemplate<String, Product> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public String sendMessage(Product product) {
        kafkaTemplate.send("quickstart-events",product);
        return product.name();
    }

}