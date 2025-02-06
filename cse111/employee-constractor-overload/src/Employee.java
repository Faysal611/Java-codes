public class Employee {
    private String name;
    private int id;
    private int salery;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employee(String name, int id, int salery) {
        this.name = name;
        this.id = id;
        this.salery = salery;
    }

    public void details() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salery: " + salery + " BDT");
    }
}
