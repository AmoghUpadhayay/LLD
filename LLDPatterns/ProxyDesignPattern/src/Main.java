public class Main {
    public static void main(String[] args) {
        try{
            EmployeeDao employeeDao = new EmployeeProxy();
            employeeDao.create("USER");
            System.out.println("Success");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}