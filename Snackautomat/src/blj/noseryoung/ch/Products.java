package blj.noseryoung.ch;

public class Products {
    private String name;
    private String category;
    private int price;
    private int numInStock;


    void initProducts() {
        Products prod01 = new Products();
        prod01.setName("Coca Kola");
        prod01.setCategory("Beverage");
        prod01.setPrice(2);
        prod01.setNumInStock(10);

        Products prod02 = new Products();
        prod02.setName("Fanto");
        prod02.setCategory("Beverage");
        prod02.setPrice(2);
        prod02.setNumInStock(10);

        Products prod03 = new Products();
        prod03.setName("Spirite");
        prod03.setCategory("Beverage");
        prod03.setPrice(2);
        prod03.setNumInStock(10);

        Products prod04 = new Products();
        prod04.setName("RedGull");
        prod04.setCategory("Energy Drink");
        prod04.setPrice(3);
        prod04.setNumInStock(8);

        Products prod05 = new Products();
        prod05.setName("Water");
        prod05.setCategory("Beverage");
        prod05.setPrice(1);
        prod05.setNumInStock(15);

        Products prod06 = new Products();
        prod06.setName("Coffee");
        prod06.setCategory("Hot Beverage");
        prod06.setPrice(2);
        prod06.setNumInStock(12);

        Products prod07 = new Products();
        prod07.setName("Sandwich");
        prod07.setCategory("Food");
        prod07.setPrice(5);
        prod07.setNumInStock(6);

        Products prod08 = new Products();
        prod08.setName("N&N");
        prod08.setCategory("Snacks");
        prod08.setPrice(3);
        prod08.setNumInStock(10);

        Products prod09 = new Products();
        prod09.setName("Nickers");
        prod09.setCategory("Snacks");
        prod09.setPrice(2);
        prod09.setNumInStock(10);

        Products prod10 = new Products();
        prod10.setName("Meltesers");
        prod10.setCategory("Snacks");
        prod10.setPrice(2);
        prod10.setNumInStock(10);

        Products prod11 = new Products();
        prod11.setName("Tringels");
        prod11.setCategory("Snacks");
        prod11.setPrice(3);
        prod11.setNumInStock(8);

        Products prod12 = new Products();
        prod12.setName("Haribu");
        prod12.setCategory("Snacks");
        prod12.setPrice(2);
        prod12.setNumInStock(10);

        Products prod13 = new Products();
        prod13.setName("Lighter");
        prod13.setCategory("Miscellaneous");
        prod13.setPrice(4);
        prod13.setNumInStock(5);

        Products prod14 = new Products();
        prod14.setName("Condoms");
        prod14.setCategory("Personal Care");
        prod14.setPrice(6);
        prod14.setNumInStock(5);

        Products prod15 = new Products();
        prod15.setName("Pregnancy Test");
        prod15.setCategory("Health");
        prod15.setPrice(10);
        prod15.setNumInStock(3);

        Products prod16 = new Products();
        Products prod17 = new Products();
        Products prod18 = new Products();
        Products prod19 = new Products();
        Products prod20 = new Products();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumInStock() {
        return numInStock;
    }

    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }
}