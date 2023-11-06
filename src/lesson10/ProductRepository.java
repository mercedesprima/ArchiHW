package lesson10;

import java.util.List;

public class ProductRepository {
    private ProductDAO productDAO;

    public ProductRepository() {
        this.productDAO = new ProductDAO();
    }

    public void addProduct(Product product) {
        productDAO.add(product);
    }

    public void deleteProduct(int id) {
        productDAO.delete(id);
    }

    public List<Product> getAllProducts() {
        return productDAO.getAll();
    }

    // Логика, связанная с продуктами
}
