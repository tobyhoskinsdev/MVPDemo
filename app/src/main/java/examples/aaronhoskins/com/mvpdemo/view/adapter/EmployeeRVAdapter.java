package examples.aaronhoskins.com.mvpdemo.view.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import examples.aaronhoskins.com.mvpdemo.R;
import examples.aaronhoskins.com.mvpdemo.model.employee.Employee;

public class EmployeeRVAdapter
        extends RecyclerView.Adapter<EmployeeRVAdapter.ViewHolder>
        implements AdapterContract{
    ArrayList<Employee> employeeArrayList;
    AdapterPresenter adapterPresenter;

    public EmployeeRVAdapter(ArrayList<Employee> employeeArrayList) {
        this.employeeArrayList = employeeArrayList;
        adapterPresenter = new AdapterPresenter(this);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.employee_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Employee currentEmployee = employeeArrayList.get(i);
        viewHolder.tvEmployeeName.setText(currentEmployee.getEmployeeName());
        viewHolder.tvEmployeePayRate.setText(currentEmployee.getEmployeePayRate());
        viewHolder.tvEmployeeHireDate.setText(currentEmployee.getEmployeeHireDate());
        viewHolder.tvEmployeeDepartment.setText(currentEmployee.getEmployeeDepartment());
        viewHolder.tvEmployeePayTerms.setText(adapterPresenter.getPayTermString(currentEmployee.isHourly()));

    }

    @Override
    public int getItemCount() {
        return employeeArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvEmployeeName;
        TextView tvEmployeePayRate;
        TextView tvEmployeePayTerms;
        TextView tvEmployeeHireDate;
        TextView tvEmployeeDepartment;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvEmployeeName = itemView.findViewById(R.id.tvEmployeeName);
            tvEmployeePayRate = itemView.findViewById(R.id.tvEmployeePayRate);
            tvEmployeePayTerms = itemView.findViewById(R.id.tvEmployeePayTerms);
            tvEmployeeHireDate = itemView.findViewById(R.id.tvEmployeeHireDate);
            tvEmployeeDepartment = itemView.findViewById(R.id.tvEmployeeDepartment);

        }
    }
}
