//2017112071_김응관
package Week10.P4;

public class HiVolCustomer extends Customer{
    public Customer clone() throws CloneNotSupportedException {
        return new HiVolCustomer();
    }
}
