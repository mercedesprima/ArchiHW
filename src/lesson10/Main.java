package lesson10;

import java.util.List;

//Вот пример реализации приложения для управления продуктами, используя паттерны Unit of Work, Service Layer, Repository и DAO:
public class Main {
    public static void main(String[] args) {
        UnitOfWork uow = new UnitOfWork();

        Product product1 = new Product(1, "Product 1", 150.0);
        Product product2 = new Product(2, "Product 2", 20.0);

        uow.addProduct(product1);
        uow.addProduct(product2);

        // Попробовать отменить транзакцию
        uow.rollback();

        // Завершить транзакцию и вывести список всех продуктов
        uow.commit();
        List<Product> products = uow.getAllProducts();
        for (Product product : products) {
            System.out.println(product.getName() + " " + product.getPrice());
        }
    }
}

