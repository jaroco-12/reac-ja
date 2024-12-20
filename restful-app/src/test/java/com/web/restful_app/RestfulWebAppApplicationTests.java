package com.web.restful_app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RestfulWebAppApplicationTests {

	@Autowired
	private ProductsRepository productsRepository;

	@Test
	void contextLoads() {
	}


	@Test
	void checkItems() {

		Long productId = 1L; // Replace with a valid product ID
		String expectedName = "Intel Core i9-13900K";

		Optional<Products> optionalProduct = productsRepository.findById(productId);

		assertTrue(optionalProduct.isPresent());
		Products product = optionalProduct.get();
		assertEquals(expectedName, product.getProductName());

	}

}
