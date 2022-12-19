package com.example.eva.service;

import static org.mockito.Mockito.when;
import com.example.eva.model.Product;
import com.example.eva.repository.ShopRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class ShopServiceTest {

    @Autowired
    private ShopService shopService;
    @MockBean
    private ShopRepository shopRepository;

    @Test
    void findAll() {
        when(shopRepository.findAll()).thenReturn((List<Product>) new Product(1L, "", ""));
        List<Product> productsFromMock = new ArrayList<>();

        Stream<Product> products = shopService.nameFilter("");

        Assert.assertEquals(products, productsFromMock);
        //Assertions.assertTrue(shopRepository.findAll().size() == 10);
    }
}
