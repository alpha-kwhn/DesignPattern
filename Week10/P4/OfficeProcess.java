//2017112071_김응관
package Week10.P4;

public class OfficeProcess {
    private Customer customerPrototype;

    OfficeProcess(Customer customer) {
        this.customerPrototype = customer;
    }

    void doing() throws CloneNotSupportedException {
        Customer cloned = customerPrototype.clone();
    }
}
