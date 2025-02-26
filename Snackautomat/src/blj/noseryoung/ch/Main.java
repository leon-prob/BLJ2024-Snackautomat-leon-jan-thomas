package blj.noseryoung.ch;
import blj.noseryoung.ch.Menu;
import blj.noseryoung.ch.Products;



public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Products products = new Products();

        products.initProducts();
        menu.introScreen();

    }
}