public class store {
    private String storeName;
    private int storeId;
    private product[] productList = new product[5];
    private int revenue;
    private int count = 0;

    public store(String name, int id) {
        this.storeName = name;
        this.storeId = id;
    }

    public void addProduct(product p) {
        if(count < 4) {
            productList[count] = p;
            count++;
        }
    }

    public void showList() {
        System.out.println("Product List: ");
        for(int i = 0; i < count; i++) {
            System.out.println("Product name: " + productList[i].name + "; Product cost: $" + productList[i].cost); //make it private
        }
    }

    public void showRevenue() {
        int temp = 0;
        System.out.print("Total revenue of " + storeName + " is: ");
        for(int i = 0; i < count; i++) {
            temp += productList[i].cost;
        }
        System.out.println("$" + temp);
    }

    public void storeDetails() {
        System.out.println("Store name:" + storeName);
        System.out.println("Store ID: " + storeId);
        System.out.println("");
        this.showList();
        this.showRevenue();
        System.out.println("");
    }
}
