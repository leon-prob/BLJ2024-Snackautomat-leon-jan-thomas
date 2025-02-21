package blj.noseryoung.ch;


import java.util.Scanner;

public class Menu {
    public void mainMenu() {
        Scanner main = new Scanner(System.in);
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
                System.out.print("Press Enter to Continue");
                main.nextLine();





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
        String mainMenu = main.nextLine();
        switch (mainMenu) {
            case "1":
                break;
            //Show Purse function
            case "2":
                //Show all Products function
                break;
            case "3":
                initBuyProduct();
                break;
            case "4":
                //Exit function
                break;
            default:
                //Input not Valid function
                break;
        }
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


