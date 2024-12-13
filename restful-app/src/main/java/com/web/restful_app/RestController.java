package com.web.restful_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private ProductsRepository productsRepository;



    @GetMapping(path="/blank")
    public String index() {
        return "index";
    }

    @GetMapping(path = "/all")
    public Iterable<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Products> getProduct(@PathVariable Long id) {
        return productsRepository.findById(id);
    }

}
