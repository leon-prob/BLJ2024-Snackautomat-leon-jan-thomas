package ch.noseryoung.blj;

import java.util.Scanner;

public class secretKey {
    private final String SECRET_KEY = "sm"; // SecretKey
    private boolean initialFillingDone = false;

    Scanner scanner = new Scanner(System.in);
    Products products = new Products();


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
        do {
            contin = true;
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
                    // restockAll();
                    break;
                case "5":
                    System.out.println("Back to the Main Menu...");
                    Menu menu = new Menu();
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
        System.out.println("Enter the product number to replace:");
        int productNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the name of the new product:");
        String newName = scanner.nextLine();

        System.out.println("Enter the category of the new product:");
        String newCategory = scanner.nextLine();

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
        System.out.println("Enter the product number to change price:");
        int productNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the new price:");
        int newPrice = scanner.nextInt();
        scanner.nextLine();

        Products product = products.getProduct(productNumber - 1);
        if (product != null) {
            product.setPrice(newPrice);
            products.saveProducts();
            System.out.println("Price changed successfully.");
        } else {
            System.out.println("Invalid product number.");
        }
    }
}