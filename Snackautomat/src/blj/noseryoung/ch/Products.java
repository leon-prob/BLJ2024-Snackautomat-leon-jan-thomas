package blj.noseryoung.ch;

public class Products {
    private String name;
    private String category;
    private int price;
    private int numInStock;

    Products prod01 = new Products();
    Products prod02 = new Products();
    Products prod03 = new Products();
    Products prod04 = new Products();
    Products prod05 = new Products();
    Products prod06 = new Products();
    Products prod07 = new Products();
    Products prod08 = new Products();
    Products prod09 = new Products();
    Products prod10 = new Products();
    Products prod11 = new Products();
    Products prod12 = new Products();
    Products prod13 = new Products();
    Products prod14 = new Products();
    Products prod15 = new Products();
    Products prod16 = new Products();
    Products prod17 = new Products();
    Products prod18 = new Products();
    Products prod19 = new Products();
    Products prod20 = new Products();
    void initProducts() {
        prod01.setName("Coca Kola");
        prod01.setCategory("Beverage");
        prod01.setPrice(2);
        prod01.setNumInStock(10);

        prod02.setName("Fanto");
        prod02.setCategory("Beverage");
        prod02.setPrice(2);
        prod02.setNumInStock(10);

        prod03.setName("Spirite");
        prod03.setCategory("Beverage");
        prod03.setPrice(2);
        prod03.setNumInStock(10);

        prod04.setName("RedGull");
        prod04.setCategory("Energy Drink");
        prod04.setPrice(3);
        prod04.setNumInStock(8);

        prod05.setName("Water");
        prod05.setCategory("Beverage");
        prod05.setPrice(1);
        prod05.setNumInStock(15);

        prod06.setName("Coffee");
        prod06.setCategory("Hot Beverage");
        prod06.setPrice(2);
        prod06.setNumInStock(12);

        prod07.setName("Sandwich");
        prod07.setCategory("Food");
        prod07.setPrice(5);
        prod07.setNumInStock(6);

        prod08.setName("N&N");
        prod08.setCategory("Snacks");
        prod08.setPrice(3);
        prod08.setNumInStock(10);

        prod09.setName("Nickers");
        prod09.setCategory("Snacks");
        prod09.setPrice(2);
        prod09.setNumInStock(10);

        prod10.setName("Meltesers");
        prod10.setCategory("Snacks");
        prod10.setPrice(2);
        prod10.setNumInStock(10);

        prod11.setName("Tringels");
        prod11.setCategory("Snacks");
        prod11.setPrice(3);
        prod11.setNumInStock(8);

        prod12.setName("Haribu");
        prod12.setCategory("Snacks");
        prod12.setPrice(2);
        prod12.setNumInStock(10);

        prod13.setName("Lighter");
        prod13.setCategory("Miscellaneous");
        prod13.setPrice(4);
        prod13.setNumInStock(5);

        prod14.setName("Condoms");
        prod14.setCategory("Personal Care");
        prod14.setPrice(6);
        prod14.setNumInStock(5);

        prod15.setName("Pregnancy Test");
        prod15.setCategory("Health");
        prod15.setPrice(10);
        prod15.setNumInStock(3);
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