package ch.noseryoung.blj;

import ch.noseryoung.blj.Menu;
import ch.noseryoung.blj.Products;



public class Main {
    public static void main(String[] args) {
         String name = "name";
         String category = "category";
         int price = 0;
         int numInStock = 0;
        Products products = new Products(name, category, price, numInStock);
        Menu menu = new Menu(products);

        products.initProducts();
        menu.introScreen();
    }
}