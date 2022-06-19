//2017112071_김응관
package Week10.P4;
import java.util.*;

public abstract class Customer implements Cloneable {
    private List<String> lis;

    public Customer() {
        this.lis = new ArrayList<>();
    }

    public Customer(List<String> lis) {
        this.lis = lis;
    }

    public List<String> getCarList() {
        return lis;
    }

    public void listAll(){
        this.lis.add("Edith Wharton");
        this.lis.add("Henry James");
    }
        // db에서 자동차의 종류를 가져오는 코드

    public Customer clone() throws CloneNotSupportedException {
        return null;
    }
}
