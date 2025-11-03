import java.util.*;
import java.util.stream.*;
import java.util.Map.Entry;

class Product {
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return name + " - " + category + " - Price: " + price;
    }
}

public class ProductStreamOperations {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 80000, "Electronics"),
            new Product("Mobile", 40000, "Electronics"),
            new Product("Rice", 2000, "Grocery"),
            new Product("Sugar", 1500, "Grocery"),
            new Product("Shirt", 1200, "Clothing"),
            new Product("Jeans", 2500, "Clothing")
        );

        System.out.println("All Products:");
        products.forEach(System.out::println);

        // Group products by category
        Map<String, List<Product>> groupedByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
        System.out.println("\nProducts Grouped by Category:");
        groupedByCategory.forEach((cat, prodList) -> {
            System.out.println(cat + " -> " + prodList.stream()
                    .map(Product::getName)
                    .collect(Collectors.joining(", ")));
        });

        // Find the most expensive product in each category
        Map<String, Optional<Product>> maxPriceByCategory = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.maxBy(Comparator.comparingDouble(Product::getPrice))
                ));
        System.out.println("\nMost Expensive Product in Each Category:");
        maxPriceByCategory.forEach((cat, prod) -> 
            System.out.println(cat + " -> " + prod.get().getName() + " (₹" + prod.get().getPrice() + ")")
        );

        // Calculate average price of all products
        double averagePrice = products.stream()
                .collect(Collectors.averagingDouble(Product::getPrice));
        System.out.println("\nAverage Price of All Products: ₹" + averagePrice);
    }
}
