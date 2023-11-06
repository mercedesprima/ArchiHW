package lesson10;

import java.util.List;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService() {
        this.productRepository = new ProductRepository();
    }

    public void addProduct(Product product) {
        // Бизнес-логика
        productRepository.addProduct(product);
    }

    public void deleteProduct(int id) {
        // Бизнес-логика
        productRepository.deleteProduct(id);
    }

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    // Другие методы сервисного слоя
}
