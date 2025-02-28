package ch.noseryoung.blj;


import java.util.Scanner;

public class Menu {
    secretMenu sk = new secretMenu();
    private final Scanner menu = new Scanner(System.in);
    private final Products products;
    private final Purse purse = new Purse(); // Purse starts with 100 CHF.

    public Menu(Products products) {
        this.products = products;
    }
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void introScreen() { // ASCII Art
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

        boolean contin = true;
        System.out.println(
                "###########################\n" +
                "# What do you wish to do? #\n" +
                "###########################\n" +
                "# Show Purse           1  #\n" +
                "# Show all Products    2  #\n" +
                "# Buy a Product        3  #\n" +
                "# Exit                 4  #\n" +
                "###########################\n");

        do {
            contin = true;
            System.out.println("Enter a number (1-4):");
            String mainMenu = menu.nextLine();
            switch (mainMenu) {
                case "1":
                    showPurse(); // Display Purse
                    break;
                case "2":
                    showProductsMenu(); //Show all Products function
                    break;
                case "3":
                    initBuyProduct(); //Show buying Menu
                    break;
                case "4":
                    //Exit
                    break;
                case "sm":
                    sk.handleSecretKey("sm"); // SecretMenu
                    break;
                default:
                    contin = false;
                    System.out.println("Invalid Input\nTry Again");
                    break;
            }
        } while (!contin);
    }

    public void showProductsMenu() { //printing menu for Product category
        boolean contin;
        do {
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
            contin = false;
            System.out.println("Enter a number (1-4) or\nReturn to main Menu (5):");
            String productCategory = menu.nextLine();
            switch (productCategory) {
                case "1":
                    category = "valid";
                    products.compareCategory(category, false);

                    break;
                case "2":
                    category = "Snacks";
                    products.compareCategory(category, false);

                    break;
                case "3":
                    category = "Beverage";
                    products.compareCategory(category, false);

                    break;
                case "4":
                    category = "others";
                    products.compareCategory(category, false);

                    break;
                case "5":
                    contin = true;
                    mainMenu();
                    break;
                default:
                    contin = false;
                    System.out.println("Invalid Input\nTry Again");
                    break;
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
                        "#                         #\n" +
                        "#                         #\n" +
                        "###########################\n"
        );

        while (true) {
            products.compareCategory("valid", true); //Printing all Products to choose
            System.out.print("Enter product number (1-20) or 'x' to return to Main Menu: ");
            String prodNum = menu.nextLine();
            System.out.print("How many of them do you want to buy (1-5) or 'x' to return to Main Menu: ");
            String quantity = menu.nextLine();


            if (prodNum.equalsIgnoreCase("x") || quantity.equalsIgnoreCase("x")) {
                mainMenu();
                return;
            }

            try {
                int productIndex = Integer.parseInt(prodNum);
                int multiplier = Integer.parseInt(quantity);

                if (productIndex < 1 || productIndex > 20) {
                    System.out.println("Please enter a valid number between 1 and 20.");
                    continue;
                }

                if (multiplier < 1 || multiplier > 20) {
                    System.out.println("Please enter a valid number between 1 and 5.");
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

                // Calculate total cost
                int totalCost = selectedProduct.getPrice() * multiplier;

                // Check if the user can afford the total cost
                if (purse.getBalance() < totalCost) {
                    System.out.println("You can't afford that many products! Try to buy fewer Products");
                    continue;
                }

                // Update balance and stock
                purse.setBalance(purse.getBalance() - totalCost);
                selectedProduct.setNumInStock(selectedProduct.getNumInStock() - multiplier);

                // Save the updated products
                products.saveProducts();

                System.out.println("You bought " + multiplier + " " + selectedProduct.getName() + " for "
                        + totalCost + " CHF!");
                purse.setBalance(purse.getBalance() - selectedProduct.getPrice() * multiplier);
                selectedProduct.setNumInStock(selectedProduct.getNumInStock() - 1);

                System.out.println("You bought " + selectedProduct.getName() + " for "
                        + selectedProduct.getPrice() * multiplier + " CHF!");
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

    public void secretMenuModifyPrice() {

        products.compareCategory("all", true); //Printing all Products to choose
        System.out.println("Wich Product do you want to Modify?\nPick a Product (exp: Coca Kola)");
        String secretMenuChooseProduct = menu.nextLine();
        if (isNumeric(secretMenuChooseProduct)) {
            if (Integer.parseInt(secretMenuChooseProduct) >= 1 && Integer.parseInt(secretMenuChooseProduct) <= 20) {}
        }
        products.printProducts(1, true);
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

