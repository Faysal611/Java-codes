public class Main {
    public static void main(String[] args) throws Exception {
        if(args.length != 4) {
            System.out.println("Please provide necessary CL argument in this format: NAME ID SALERY DEPARTMENT");
            return;
        }

        Employee E1 = new Employee(args[0], args[1], args[2], args[3]);
        
    }
}
