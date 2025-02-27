package ch.noseryoung.blj;

public class Main {
    public static void main(String[] args) {

        Products products = new Products();
        products.initProducts();

        Menu menu = new Menu(products);
        menu.introScreen();
    }
}
