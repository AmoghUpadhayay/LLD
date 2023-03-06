public class EmployeeProxy implements EmployeeDao{
    EmployeeDao employeeDao;
    EmployeeProxy(){
        employeeDao = new EmployeeDaoImpl();
    }
    @Override
    public void create(String emp) throws Exception{
        if(emp == "ADMIN"){
            employeeDao.create(emp);
            return;
        } else{
            throw new Exception("Cant Be Created");
        }
    }

    @Override
    public void remove(String emp) throws Exception{
        if(emp == "ADMIN"){
            employeeDao.remove(emp);
            return;
        } else{
            throw new Exception("Cant Be Removed");
        }
    }

    @Override
    public void update(String emp) throws Exception{
        if(emp == "ADMIN"){
            employeeDao.update(emp);
            return;
        } else{
            throw new Exception("Cant Be updated");
        }
    }
}
