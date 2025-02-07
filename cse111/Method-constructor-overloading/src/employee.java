public class employee {
    private String name;
    private String dep;
    private int salery;
    private int id;

    public employee(String name, String dep, int salery, int id) {
        this.name = name;
        this.dep = dep;
        this.salery = salery;
        this.id = id;
    }

    public employee(String name, String dep, int salery) {
        this.name = name;
        this.dep = dep;
        this.salery = salery;
    }

    public employee(String name, int salery) {
        this.name = name;
        this.salery = salery;
    }

    public void details() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + dep);
        System.out.println("Salery: " + salery + " BDT");
        System.out.println("ID: " + id);
        System.out.println("");
    }

    public void details(String str) {
        if(str.toLowerCase().equals("short")) {
            System.out.println("N/D/I/S: " + name + " / " + dep + " / " + id + " / " + salery);
            System.out.println("");
        }
        else {
            System.out.println("Wrong argument");
        }
    }

    public void update(String name, String dep) {
        this.name = name;
        this.dep = dep;
    }

    public void update(int salery, int id) {
        this.salery = salery;
        this.id = id;
    }
}
