package ch.noseryoung.blj;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Products {
    private String name;
    private String category;
    private int price;
    private int numInStock;
    private final List<Products> productList = new ArrayList<>();

    public Products(String name, String category, int price, int numInStock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.numInStock = numInStock;
        loadProducts();
    }

    void initProducts() {
        File file = new File("stock.txt");
        if (file.exists() && file.length() > 0) {
            try (Scanner fileScanner = new Scanner(file)) {
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] parts = line.split(",");
                    if (parts.length == 4) {
                        String name = parts[0];
                        String category = parts[1];
                        int price = Integer.parseInt(parts[2]);
                        int numInStock = Integer.parseInt(parts[3]);
                        productList.add(new Products(name, category, price, numInStock));
                    } else {
                        System.err.println("Invalid product data in stock.txt: " + line);
                    }
                }
                System.out.println("Products loaded from stock.txt.");
            } catch (IOException e) {
                System.err.println("Error reading products from file: " + e.getMessage());
            }
        } else {
            productList.clear();
            productList.add(new Products("Coca Kola", "Beverage", 2, 0));
            productList.add(new Products("Fanta", "Beverage", 2, 0));
            productList.add(new Products("Sprite", "Beverage", 2, 0));
            productList.add(new Products("Red Bull", "Beverage", 3, 0));
            productList.add(new Products("Water", "Beverage", 1, 0));
            productList.add(new Products("Coffee", "Beverage", 2, 0));
            productList.add(new Products("Sandwich", "Snacks", 5, 0));
            productList.add(new Products("M&Ms", "Snacks", 3, 0));
            productList.add(new Products("Snickers", "Snacks", 2, 0));
            productList.add(new Products("Maltesers", "Snacks", 2, 0));
            productList.add(new Products("Tringles", "Snacks", 3, 0));
            productList.add(new Products("Haribo", "Snacks", 2, 0));
            productList.add(new Products("Lighter", "others", 4, 0));
            productList.add(new Products("Condoms", "others", 6, 0));
            productList.add(new Products("Pregnancy Test", "others", 10, 0));
            productList.add(new Products("Product 16", "Not Available", 0, 0));
            productList.add(new Products("Product 17", "Not Available", 0, 0));
            productList.add(new Products("Product 18", "Not Available", 0, 0));
            productList.add(new Products("Product 19", "Not Available", 0, 0));
            productList.add(new Products("Product 20", "Not Available", 0, 0));

            saveProducts();
            System.out.println("Default products initialized and saved to stock.txt.");
        }
    }

    public void compareCategory(String category, boolean secretModeON) {
        if (secretModeON) {
            System.out.printf("| %-4s | %-17s | %-35s | %-5s | %-8s |\n", "Nr.", "Name", "Category", "Price", "In Stock");
            System.out.println("+------+-------------------+-------------------------------------+-------+----------+");
        } else {
            System.out.printf("| %-17s | %-35s | %-5s | %-8s |\n", "Name", "Category", "Price", "In Stock");
            System.out.println("+-------------------+-------------------------------------+-------+----------+");
        }
        if (category.equals("valid")) {
            for (int i = 0; i < productList.size(); i++) {
                if (getProduct(i).getCategory().equals("Not Available")) {
                } else {
                    printProducts(i, secretModeON);
                }
            }
        } else if (category.equals("all")) {
            for (int i = 0; i < productList.size(); i++) {
                printProducts(i, secretModeON);
            }
        } else {
            for (int i = 0; i < productList.size(); i++) {
                if (getProduct(i).getCategory().equals(category)) {
                    printProducts(i, secretModeON);
                }
            }
        }
    }

    void printProducts(int product, boolean secretModeON) {
        if (secretModeON) {
            System.out.printf("| %-4d | %-17s | %-35s | %-5d | %-8d |\n", product + 1, getProduct(product).getName(), getProduct(product).getCategory(), getProduct(product).getPrice(), getProduct(product).getNumInStock());
            System.out.println("+------+-------------------+-------------------------------------+-------+----------+");
        } else {
            System.out.printf("| %-17s | %-35s | %-5d | %-8d |\n", getProduct(product).getName(), getProduct(product).getCategory(), getProduct(product).getPrice(), getProduct(product).getNumInStock());
            System.out.println("+-------------------+-------------------------------------+-------+----------+");
        }
    }

    public Products getProduct(int index) {
        if (index >= 0 && index < productList.size()) {
            return productList.get(index);
        } else {
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumInStock() {
        return numInStock;
    }

    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }

    public List<Products> getProductList() {
        return productList;
    }

    public void saveProducts() {
        try (FileWriter writer = new FileWriter("stock.txt", false)) { // False to overwrite, not append
            for (Products product : productList) {
                writer.write(product.getName() + "," + product.getCategory() + "," +
                        product.getPrice() + "," + product.getNumInStock() + "\n");
            }
            System.out.println("Products successfully saved to stock.txt.");
        } catch (IOException e) {
            System.err.println("Error saving products to file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void loadProducts() {
        File file = new File("stock.txt");
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("stock.txt created.");
                } else {
                    System.err.println("Unable to create stock.txt.");
                }
            } catch (IOException e) {
                System.err.println("Error creating stock.txt: " + e.getMessage());
            }
        }
    }
}