package ch.noseryoung.blj;

import ch.noseryoung.blj.Menu;
import ch.noseryoung.blj.Products;



public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Products products = new Products();

        products.initProducts();
        menu.introScreen();
    }
}