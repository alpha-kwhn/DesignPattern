package Week10.P3;
import java.util.HashMap;

public class PrototypeService {
    private HashMap lis = new HashMap();
    //인스턴스의 이름과 인스턴스 객체의 대응관계를 표현하기 위한 자료구조

    public void register(String name, Product stuff){
        lis.put(name, stuff);
    }

    public Product create(String name){
        Product stuff = (Product)lis.get(name);
        return stuff.CreateClone();
    }
}
