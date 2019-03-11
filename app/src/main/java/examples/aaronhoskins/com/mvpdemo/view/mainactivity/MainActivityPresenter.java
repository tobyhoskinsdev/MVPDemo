package examples.aaronhoskins.com.mvpdemo.view.mainactivity;

import examples.aaronhoskins.com.mvpdemo.model.datasource.local.EmployeeDatabaseHelper;

public class MainActivityPresenter {
    MainActivityContract contract;
    EmployeeDatabaseHelper employeeDatabaseHelper;

    public MainActivityPresenter(MainActivityContract contract) {
        this.contract = contract;
        employeeDatabaseHelper = new EmployeeDatabaseHelper();
    }

    public void initRecyclerView() {
        contract.populateRecyclerView(employeeDatabaseHelper.getAllEmployees());
    }
}
