public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String user) {
        System.out.println("Employee added");
    }

    @Override
    public void remove(String user) {
        System.out.println("Employee removed");
    }

    @Override
    public void update(String user) {
        System.out.println("Employee Updated");
    }
}
