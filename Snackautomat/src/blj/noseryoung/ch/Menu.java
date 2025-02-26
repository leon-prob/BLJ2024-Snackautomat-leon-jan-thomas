package blj.noseryoung.ch;

import blj.noseryoung.ch.Products;
import blj.noseryoung.ch.Purse;
import java.util.Scanner;

public class Menu {
    Scanner menu = new Scanner(System.in);
    Products products = new Products();
    Purse purse = new Purse();
    secretKey sk = new secretKey();

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
                    showPurse();
                    break;
                case "2":
                    showProductsMenu(); //Show all Products function
                    break;
                case "3":
                    initBuyProduct(); //Show buying Menu
                    break;
                case "4":
                    //Exit function
                    break;
                case "sm":
                    sk.handleSecretKey("sm");
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
            System.out.println("Enter a number (1-4)\nReturn to main Menu (5):");
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
                    contin = false;
                    System.out.println("Invalid Input\nTry Again");
                    break;
            }
            products.compareCategory(category);
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
                "###########################\n");
    }

    public void showPurse() {
        boolean contin;
        Scanner scanner = new Scanner(System.in);
        System.out.println("###########################");
        System.out.printf("# Balance          %6d #\n", purse.getBalance());
        System.out.println("###########################");
        System.out.println("# Refill Purse        1  #");
        System.out.println("# Exit                2  #");
        System.out.println("###########################");
        do {
            contin = true;
            System.out.print("Choose a Option (1-2): ");

            String inputPurse = scanner.nextLine();

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

