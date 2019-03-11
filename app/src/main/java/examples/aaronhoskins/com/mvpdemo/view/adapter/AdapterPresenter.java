package examples.aaronhoskins.com.mvpdemo.view.adapter;

public class AdapterPresenter {
    AdapterContract adapterContract;
    public AdapterPresenter(AdapterContract adapterContract) {
        this.adapterContract = adapterContract;
    }

    public String getPayTermString(boolean isHourly) {
        return isHourly ? "Hourly" : "Salary";
    }
}
