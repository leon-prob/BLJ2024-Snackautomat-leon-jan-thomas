package ch.noseryoung.blj;

import java.util.Scanner;

public class secretMenu {
    private final String SECRET_KEY = "sm"; // SecretKey
    String name = "name";
    String category = "category";
    int price = 0;
    int numInStock = 0;
    Scanner scanner = new Scanner(System.in);
    Products products = new Products(name, category, price, numInStock);
    private boolean initialFillingDone = false;

    public void handleSecretKey(String input) {
        if (input.equals(SECRET_KEY)) {
            secretMenu();
        }
    }

    private void secretMenu() {
        if (!initialFillingDone) {
            initialFilling();
            initialFillingDone = true;
        }

        boolean contin;
        do {

            System.out.println(
                    "###########################\n" +
                            "# Secret Menu             #\n" +
                            "###########################\n" +
                            "# Refill Product       1  #\n" +
                            "# Replace Product      2  #\n" +
                            "# Change Price         3  #\n" +
                            "# Restock All          4  #\n" +
                            "# Main Menu            5  #\n" +
                            "###########################\n");
            contin = false;
            System.out.println("Enter a number (1-4):");
            String secretMenu = scanner.nextLine();
            switch (secretMenu) {
                case "1":
                    refillProduct();
                    break;
                case "2":
                    replaceProduct();
                    break;
                case "3":
                    changePrice();
                    break;
                case "4":
                    restockAll();
                    break;
                case "5":
                    contin = true;
                    System.out.println("Back to the Main Menu...");
                    Menu menu = new Menu(products);
                    menu.mainMenu();
                    break;
                default:
                    contin = false;
                    System.out.println("Invalid Input\nTry Again");
                    break;
            }
        } while (!contin);
    }

    private void initialFilling() {
        products.initProducts();
        products.saveProducts();
        System.out.println("Vending machine filled for the first time.");
    }

    private void refillProduct() {
        products.compareCategory("all", true);
        System.out.println("Enter the product number to refill:");
        int productNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the quantity to add:");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        Products product = products.getProduct(productNumber - 1);
        if (product != null) {
            int currentStock = product.getNumInStock();
            product.setNumInStock(currentStock + quantity);
            products.saveProducts();
            System.out.println("Product refilled successfully.");
        } else {
            System.out.println("Invalid product number.");
        }
    }

    private void replaceProduct() {
        products.compareCategory("all", true);
        System.out.println("Enter the product number to replace:");
        int productNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the name of the new product:");
        String newName = scanner.nextLine();

        System.out.println("Enter the category of the new product (Beverage, Snacks, others):");
        String newCategory = scanner.nextLine();

        while (!newCategory.equals("Beverage") && !newCategory.equals("Snacks") && !newCategory.equals("others")) {
            System.out.println("Invalid category. Please enter Beverage, Snacks, or others:");
            newCategory = scanner.nextLine();
        }

        System.out.println("Enter the price of the new product:");
        int newPrice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the initial stock of the new product:");
        int newStock = scanner.nextInt();
        scanner.nextLine();

        Products product = products.getProduct(productNumber - 1);
        if (product != null) {
            product.setName(newName);
            product.setCategory(newCategory);
            product.setPrice(newPrice);
            product.setNumInStock(newStock);
            products.saveProducts();
            System.out.println("Product replaced successfully.");
        } else {
            System.out.println("Invalid product number.");
        }
    }

    private void changePrice() {
        products.compareCategory("all", true);

        while (true) {
            System.out.println("Enter the product number to change price:");
            if (scanner.hasNextInt()) {
                int productNumber = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter the new price:");
                if (scanner.hasNextInt()) {
                    int newPrice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline

                    Products product = products.getProduct(productNumber - 1);
                    if (product != null) {
                        product.setPrice(newPrice);
                        products.saveProducts();
                        System.out.println("Price changed successfully.");
                        break;
                    } else {
                        System.out.println("Invalid product number.");
                    }
                } else {
                    System.out.println("Invalid input for new price. Please enter an integer.");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Invalid input for product number. Please enter an integer.");
                scanner.nextLine();
            }
        }
    }

    private void restockAll() {
        for (Products product : products.getProductList()) {
            if (!product.getCategory().equals("Not Available")) {
                product.setNumInStock(20);
            }
        }
        products.saveProducts();
        System.out.println("All products have been restocked to 20 units each.");
    }
}