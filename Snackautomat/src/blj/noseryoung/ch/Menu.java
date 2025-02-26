package blj.noseryoung.ch;

import java.util.Scanner;

public class Menu {
    private Scanner menu = new Scanner(System.in);
    private Products products;
    private Purse purse = new Purse(); // Purse starts with 100 CHF.

    public Menu(Products products) {
        this.products = products;
    }

    public void introScreen() {
        System.out.println("Welcome to THE\n" +
                " /$$    /$$                          /$$ /$$                       \n" +
                "| $$   | $$                         | $$|__/                       \n" +
                "| $$   | $$ /$$$$$$  /$$$$$$$   /$$$$$$$ /$$ /$$$$$$$   /$$$$$$    \n" +
                "|  $$ / $$//$$__  $$| $$__  $$ /$$__  $$| $$| $$__  $$ /$$__  $$   \n" +
                " \\  $$ $$/| $$$$$$$$| $$  \\ $$| $$  | $$| $$| $$  \\ $$| $$  \\ $$   \n" +
                "  \\  $$$/ | $$_____/| $$  | $$| $$  | $$| $$| $$  | $$| $$  | $$   \n" +
                "   \\  $/  |  $$$$$$$| $$  | $$|  $$$$$$$| $$| $$  | $$|  $$$$$$$   \n" +
                "    \\_/    \\_______/|__/  |__/ \\_______/|__/|__/  |__/ \\____  $$   \n" +
                "                                                       /$$  \\ $$   \n" +
                "                                                      |  $$$$$$/   \n" +
                "                                                       \\______/    \n" +
                " /$$      /$$                     /$$       /$$                    \n" +
                "| $$$    /$$$                    | $$      |__/                    \n" +
                "| $$$$  /$$$$  /$$$$$$   /$$$$$$$| $$$$$$$  /$$ /$$$$$$$   /$$$$$$ \n" +
                "| $$ $$/$$ $$ |____  $$ /$$_____/| $$__  $$| $$| $$__  $$ /$$__  $$\n" +
                "| $$  $$$| $$  /$$$$$$$| $$      | $$  \\ $$| $$| $$  \\ $$| $$$$$$$$\n" +
                "| $$\\  $ | $$ /$$__  $$| $$      | $$  | $$| $$| $$  | $$| $$_____/\n" +
                "| $$ \\/  | $$|  $$$$$$$|  $$$$$$$| $$  | $$| $$| $$  | $$|  $$$$$$$\n" +
                "|__/     |__/ \\_______/ \\_______/|__/  |__/|__/|__/  |__/ \\_______/\n" +
                "                                                                   ");
        mainMenu();
    }

    public void mainMenu() {
        while (true) {
            System.out.println("###########################");
            System.out.println("# What do you wish to do? #");
            System.out.println("###########################");
            System.out.println("# Show Purse           1  #");
            System.out.println("# Show all Products    2  #");
            System.out.println("# Buy a Product        3  #");
            System.out.println("# Exit                 4  #");
            System.out.println("###########################");
            System.out.print("Enter a number (1-4): ");

            String choice = menu.nextLine();
            switch (choice) {
                case "1":
                    showPurse();
                    break;
                case "2":
                    showProductsMenu();
                    break;
                case "3":
                    initBuyProduct();
                    break;
                case "4":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Input. Try Again.");
            }
        }
    }

    public void showProductsMenu() {
        boolean contin;
        String category = "0";
        System.out.println(
                "###########################\n" +
                        "# What Product Category   #\n" +
                        "# do you want to see?     #\n" +
                        "###########################\n" +
                        "# All Products         1  #\n" +
                        "# Snacks               2  #\n" +
                        "# Beverage             3  #\n" +
                        "# others               4  #\n" +
                        "# Main Menu            5  #\n" +
                        "###########################\n");
        do {
            contin = false;
            System.out.print("Enter a number (1-4)\nReturn to main Menu (5): ");
            String productCategory = menu.nextLine();
            switch (productCategory) {
                case "1":
                    category = "all";
                    break;
                case "2":
                    category = "Snacks";
                    break;
                case "3":
                    category = "Beverage";
                    break;
                case "4":
                    category = "others";
                    break;
                case "5":
                    contin = true;
                    mainMenu();
                    break;
                default:
                    System.out.println("Invalid Input\nTry Again");
            }
            if (!category.equals("0")) {
                products.compareCategory(category);
            }
        } while (!contin);
    }

    private void initBuyProduct() {
        System.out.println(
                "###########################\n" +
                        "# _______________________ #\n" +
                        "# | [01] [02] [03] [04] | #\n" +
                        "# | [05] [06] [07] [08] | #\n" +
                        "# | [09] [10] [11] [12] | #\n" +
                        "# | [13] [14] [15] [16] | #\n" +
                        "# | [17] [18] [19] [20] | #\n" +
                        "# |_____________________| #\n" +
                        "#                         #\n" +
                        "#       [======]          #\n" +
                        "#       [______]          #\n" +
                        "###########################\n" +
                        "# Choose a number from    #\n" +
                        "# above (01-20)           #\n" +
                        "###########################\n"
        );

        while (true) {
            System.out.print("Enter product number (1-20) or 'x' to return to Main Menu: ");
            String input = menu.nextLine();

            if (input.equalsIgnoreCase("x")) {
                mainMenu();
                return;
            }

            try {
                int productIndex = Integer.parseInt(input);

                if (productIndex < 1 || productIndex > 20) {
                    System.out.println("Please enter a valid number between 1 and 20.");
                    continue;
                }

                Products selectedProduct = products.getProduct(productIndex - 1);

                if (selectedProduct == null) {
                    System.out.println("No product found at that slot. Try again.");
                    continue;
                }

                if (selectedProduct.getCategory().equals("Not Available")
                        || selectedProduct.getNumInStock() <= 0) {
                    System.out.println("Sorry, that product is not available or out of stock.");
                    continue;
                }

                if (purse.getBalance() < selectedProduct.getPrice()) {
                    System.out.println("You do not have enough money. Please refill your purse (max 100 CHF) or choose another product.");
                    continue;
                }

                purse.setBalance(purse.getBalance() - selectedProduct.getPrice());
                selectedProduct.setNumInStock(selectedProduct.getNumInStock() - 1);

                System.out.println("You bought " + selectedProduct.getName() + " for "
                        + selectedProduct.getPrice() + " CHF!");
                System.out.println("Your new balance is: " + purse.getBalance() + " CHF");

                mainMenu();
                return;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please try again.");
            }
        }
    }

    public void showPurse() {
        boolean contin;
        System.out.println("###########################");
        System.out.printf("# Balance: %6d CHF    #\n", purse.getBalance());
        System.out.println("###########################");
        System.out.println("# Refill Purse        1  #");
        System.out.println("# Exit                2  #");
        System.out.println("###########################");
        do {
            contin = true;
            System.out.print("Choose an Option (1-2): ");

            String inputPurse = menu.nextLine();

            switch (inputPurse) {
                case "1":
                    purse.refillPurse();
                    contin = false;
                    break;
                case "2":
                    System.out.println("Back to the Main Menu...");
                    mainMenu();
                    break;
                default:
                    contin = false;
                    System.out.println("Invalid Input!\nTry Again.");
                    break;
            }
        } while (!contin);
    }
}
