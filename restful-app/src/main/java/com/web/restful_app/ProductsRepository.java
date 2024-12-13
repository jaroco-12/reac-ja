package com.web.restful_app;

import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products, Long> {
}
