package ch.noseryoung.blj;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private String name;
    private String category;
    private int price;
    private int numInStock;

    private List<Products> productList = new ArrayList<>();

    public Products() {
        // Ini via initProducts().
    }

    // Constructor for a single product.
    public Products(String name, String category, int price, int numInStock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.numInStock = numInStock;
    }

    void initProducts() {
        productList.add(new Products("Coca Kola", "Beverage", 2, 10));
        productList.add(new Products("Fanto", "Beverage", 2, 10));
        productList.add(new Products("Spirite", "Beverage", 2, 10));
        productList.add(new Products("RedGull", "Beverage", 3, 8));
        productList.add(new Products("Water", "Beverage", 1, 15));
        productList.add(new Products("Coffee", "Beverage", 2, 12));
        productList.add(new Products("Sandwich", "Snacks", 5, 6));
        productList.add(new Products("N&N", "Snacks", 3, 10));
        productList.add(new Products("Nickers", "Snacks", 2, 10));
        productList.add(new Products("Meltesers", "Snacks", 2, 10));
        productList.add(new Products("Tringels", "Snacks", 3, 8));
        productList.add(new Products("Haribu", "Snacks", 2, 10));
        productList.add(new Products("Lighter", "others", 4, 5));
        productList.add(new Products("Condoms", "others", 6, 5));
        productList.add(new Products("Pregnancy Test", "others", 10, 3));
        productList.add(new Products("Product 16", "Not Available", 0, 0));
        productList.add(new Products("Product 17", "Not Available", 0, 0));
        productList.add(new Products("Product 18", "Not Available", 0, 0));
        productList.add(new Products("Product 19", "Not Available", 0, 0));
        productList.add(new Products("Product 20", "Not Available", 0, 0));
    }

    void compareCategory(String category) {
        System.out.printf("| %-17s | %-35s | %-5s | %-8s |\n", "Name", "Category", "Price", "In Stock");
        System.out.println("+-------------------+-------------------------------------+-------+----------+");

        if (category.equals("all")) {
            for (int i = 0; i < productList.size(); i++) {
                if (!productList.get(i).getCategory().equals("Not Available")) {
                    printProducts(i);
                }
            }
        } else {
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getCategory().equals(category)) {
                    printProducts(i);
                }
            }
        }
    }

    void printProducts(int productIndex) {
        Products p = productList.get(productIndex);
        System.out.printf("| %-17s | %-35s | %-5d | %-8d |\n",
                p.getName(),
                p.getCategory(),
                p.getPrice(),
                p.getNumInStock());
        System.out.println("+-------------------+-------------------------------------+-------+----------+");
    }

    public Products getProduct(int index) {
        if (index >= 0 && index < productList.size()) {
            return productList.get(index);
        } else {
            return null;
        }
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }
    public int getPrice() {
        return price;
    }
    public int getNumInStock() {
        return numInStock;
    }

    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }
}
