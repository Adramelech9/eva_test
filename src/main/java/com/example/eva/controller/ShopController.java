package com.example.eva.controller;

import com.example.eva.model.Product;
import com.example.eva.service.ShopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
@RequestMapping("shop/product")
public record ShopController(ShopService shopService) {

    @GetMapping
    private Stream<Product> product(@RequestParam(defaultValue = "") String nameFilter) {
        return shopService.nameFilter(nameFilter);
    }
}
