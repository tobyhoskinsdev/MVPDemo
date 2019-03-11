package examples.aaronhoskins.com.mvpdemo.view.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import examples.aaronhoskins.com.mvpdemo.R;
import examples.aaronhoskins.com.mvpdemo.model.employee.Employee;
import examples.aaronhoskins.com.mvpdemo.view.adapter.EmployeeRVAdapter;

public class MainActivity extends AppCompatActivity implements MainActivityContract{
    MainActivityPresenter mainActivityPresenter;
    RecyclerView rvEmployeeList;
    EmployeeRVAdapter employeeRVAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityPresenter = new MainActivityPresenter(this);
        mainActivityPresenter.initRecyclerView();
    }

    @Override
    public void populateRecyclerView(ArrayList<Employee> employeeArrayList) {
        rvEmployeeList = findViewById(R.id.rvEmployeeList);
        rvEmployeeList.setLayoutManager(new LinearLayoutManager(this));
        employeeRVAdapter = new EmployeeRVAdapter(employeeArrayList);
        rvEmployeeList.setAdapter(employeeRVAdapter);
    }
}
