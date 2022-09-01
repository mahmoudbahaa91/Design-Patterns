package structural.adapter.objectadapter_example;

import structural.adapter.Customer;
import structural.adapter.Employee;

public class EmployeeObjectAdapter implements Customer {

    private Employee adaptee;

    public EmployeeObjectAdapter(Employee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getCustomerName() {
        return adaptee.getEmployeeName();
    }

    @Override
    public String getCustomerJob() {
        return adaptee.getEmployeeJob();
    }

    @Override
    public String getCustomerAddress() {
        return adaptee.getEmployeeAddress();
    }

}
