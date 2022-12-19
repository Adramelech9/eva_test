package com.example.eva.service;

import com.example.eva.model.Product;
import com.example.eva.repository.ShopRepository;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public record ShopService(ShopRepository shopRepository) {

    public Stream<Product> nameFilter(String filter) {
        return shopRepository.findAll().stream().filter(product -> !product.getName().matches(filter));
    }
}
