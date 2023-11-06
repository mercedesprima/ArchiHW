package lesson10;

import java.util.List;

public class UnitOfWork {
    private ProductService productService;
    private boolean isCommitted;

    public UnitOfWork() {
        this.productService = new ProductService();
        this.isCommitted = false;
    }

    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    public void deleteProduct(int id) {
        productService.deleteProduct(id);
    }

    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    public void commit() {
        // Логика для сохранения изменений в базе данных
        isCommitted = true;
    }

    public void rollback() {
        // Логика для отмены всех изменений
        isCommitted = false;
    }
}
