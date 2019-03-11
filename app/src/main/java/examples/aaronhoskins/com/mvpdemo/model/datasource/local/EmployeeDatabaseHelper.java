package examples.aaronhoskins.com.mvpdemo.model.datasource.local;

import java.util.ArrayList;

import examples.aaronhoskins.com.mvpdemo.model.employee.Employee;

public class EmployeeDatabaseHelper {
    private ArrayList<Employee> employeesDatabase;

    public EmployeeDatabaseHelper() {
        employeesDatabase = initEmployeeList();
    }

    public void insertEmployee(Employee employee) {
        employeesDatabase.add(employee);
    }

    public ArrayList<Employee> getAllEmployees(){
        return employeesDatabase;
    }

    private ArrayList<Employee> initEmployeeList() {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        employeeArrayList.add(new Employee("Bob", "15.00", "Sept 1 2012", true, "IT"));
        employeeArrayList.add(new Employee("Joe", "16.00", "Sept 2 2012", true, "IT"));
        employeeArrayList.add(new Employee("Sam", "17.00", "Sept 3 2012", true, "IT"));
        employeeArrayList.add(new Employee("John", "40,000", "Sept 4 2012", false, "IT"));
        employeeArrayList.add(new Employee("Aaron", "1000000", "Sept 5 2012", true, "IT"));
        employeeArrayList.add(new Employee("Brittany", "8.00", "Sept 6 2012", true, "IT"));
        employeeArrayList.add(new Employee("William", "9.00", "Sept 7 2012", true, "IT"));
        employeeArrayList.add(new Employee("Gary", "50,000", "Sept 8 2012", true, "IT"));
        employeeArrayList.add(new Employee("Ronnie", "15.00", "Sept 9 2012", true, "IT"));
        employeeArrayList.add(new Employee("Ally", "15.00", "Sept 10 2012", true, "IT"));
        employeeArrayList.add(new Employee("George", "15.00", "Sept 11 2012", true, "IT"));
        employeeArrayList.add(new Employee("Tonya", "15.00", "Sept 12 2012", true, "IT"));
        employeeArrayList.add(new Employee("Alex", "15.00", "Sept 13 2012", true, "IT"));
        employeeArrayList.add(new Employee("Bill", "15.00", "Sept 14 2012", true, "IT"));
        employeeArrayList.add(new Employee("Luis", "15.00", "Sept 15 2012", true, "IT"));
        employeeArrayList.add(new Employee("Manny", "15.00", "Sept 16 2012", true, "IT"));

        return employeeArrayList;
    }

}
