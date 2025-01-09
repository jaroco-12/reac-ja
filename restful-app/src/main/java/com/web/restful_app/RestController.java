package com.web.restful_app;

import com.web.restful_app.entity.Products;
import com.web.restful_app.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private ProductsRepository productsRepository;
    @Autowired
    private UserService userService;


    @GetMapping(path="/blank")
    public String index() {
        return "index";
    }

    @CrossOrigin
    @GetMapping(path = "/all")
    public Iterable<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Products> getProduct(@PathVariable Long id) {
        return productsRepository.findById(id);
    }

    @PostMapping(path = "/user/create")
    public Users addUser(@RequestBody Users user) {
        return userService.addUser(user);
    }
}
