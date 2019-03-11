package examples.aaronhoskins.com.mvpdemo.view.mainactivity;

import java.util.ArrayList;

import examples.aaronhoskins.com.mvpdemo.model.employee.Employee;

public interface MainActivityContract {
    void populateRecyclerView(ArrayList<Employee> employeeArrayList);
}
