package ch.noseryoung.blj;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Products products = new Products();

        products.initProducts();
        menu.introScreen();
    }
}