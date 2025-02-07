public class Main {
    public static void main(String[] args) throws Exception {
        product laptop = new product("Laptop", 699);
        product mobile = new product("Mobile", 399);
        product watch = new product("Watch", 299);
        product fridge = new product("Fridge", 549);
        product figurine = new product("Asanagi Cow Figurine", 99);
        product sheet = new product("Sheet", 39);
        product tv = new product("Television", 259);
        product ac = new product("Air conditioner", 289);

        store akij = new store("AKIJ Store Ltd", 24105);
        store flare = new store("Flare Store", 54198);
        store best = new store("Best Buy Store", 11920);

        akij.addProduct(laptop);
        akij.addProduct(mobile);
        akij.addProduct(figurine);
        akij.addProduct(sheet);
        akij.addProduct(ac);
        akij.storeDetails();

        flare.addProduct(tv);
        flare.addProduct(mobile);
        flare.addProduct(fridge);
        flare.addProduct(watch);
        flare.addProduct(figurine);
        flare.storeDetails();

        best.addProduct(figurine);
        best.addProduct(ac);
        best.addProduct(figurine);
        best.addProduct(laptop);
        best.addProduct(sheet);
        best.storeDetails();

    }
}
