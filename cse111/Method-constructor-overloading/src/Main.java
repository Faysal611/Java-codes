public class Main {
    public static void main(String[] args) throws Exception {
        employee e1 = new employee("Faysal", "HR", 40000, 21456);
        employee e2 = new employee("John", 52000);
        employee e3 = new employee("Walter White", "Paperwork", 20000);
        e1.details();
        e1.details("short");
        e2.details();
        e2.details("short");
        e3.details();
        e3.details("short");

    }
}
