package blj.noseryoung.ch;
import blj.noseryoung.ch.Products;



import java.util.Scanner;

public class Menu {
    Scanner menu = new Scanner(System.in);
    Products products = new Products();

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
        System.out.println("Press Enter to Continue\n");
        String pEnter = menu.nextLine();
        mainMenu();
    }




    public void mainMenu() {


        System.out.println(
                "###########################\n" +
                        "# What do you wish to do? #\n" +
                        "###########################\n" +
                        "# Show Purse           1  #\n" +
                        "# Show all Products    2  #\n" +
                        "# Buy a Product        3  #\n" +
                        "# Exit                 4  #\n" +
                        "###########################\n");
        System.out.println("Enter a number (1-4):");
        String mainMenu = menu.nextLine();
        switch (mainMenu) {
            case "1":
                break;
            //Show Purse function
            case "2":
                showProductsMenu(); //Show all Products function
                break;
            case "3":
                initBuyProduct(); //Show buying Menu
                break;
            case "4":
                //Exit function
                break;
            default:
                //Input not Valid function
                break;
        }
    }
    public void showProductsMenu() { //printing menu for Product category
        String category = "0";
        System.out.println(
                "###########################\n" +
                        "# What Product Category   #\n " +
                        "# do you want to see?     #\n" +
                        "###########################\n" +
                        "# All Products         1  #\n" +
                        "# Snacks               2  #\n" +
                        "# Beverage             3  #\n" +
                        "# others               4  #\n" +
                        "###########################\n" +
                        "# Main Menu          back #\n " +
                        "###########################\n");
        System.out.println("Enter a number (1-4 or back):");
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
            case "back":
                mainMenu();
                break;
            default:
                System.out.println("Thats not an option");
                break;
        }
        System.out.printf("| %-17s | %-35s | %-5s | %-8s |\n", "Name", "Category", "Price", "In Stock");
        System.out.println("+-------------------+-------------------------------------+-------+----------+");
        products.compareCategory(category);
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
}