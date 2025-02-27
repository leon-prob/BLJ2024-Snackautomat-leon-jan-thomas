package ch.noseryoung.blj;

import ch.noseryoung.blj.Menu;
import ch.noseryoung.blj.Products;



public class Main {
    public static void main(String[] args) {
        Products products = new Products();
        Menu menu = new Menu(products);

        products.initProducts();
        menu.introScreen();
    }
}