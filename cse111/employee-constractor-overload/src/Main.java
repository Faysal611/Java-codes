public class Main {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee("Faysal");
        Employee e2 = new Employee("Faysal", 2231);
        Employee e3 = new Employee("Faysal", 45879, 50000);
        e1.details();
        e2.details();
        e3.details();
    }
}
