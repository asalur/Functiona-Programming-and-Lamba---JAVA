package app;

import entities.Product;
import module.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static int compareProducts(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 90.00));

        ProductService ps = new ProductService();

        double sum = ps.filterSum(list, p -> p.getPrice() < 100.0 );
        System.out.println("Sum = " + String.format("%.2f", sum));

    }
}