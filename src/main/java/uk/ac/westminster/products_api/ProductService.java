package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    // Get all the product from Product List
    public List<Product> getAllProducts() {
        return products;
    }

    // Insert each product in a JASON format
    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    // Search product using ID
    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    // Delete product using ID
    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    // Search product by referring product name
    public List <Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }

}
