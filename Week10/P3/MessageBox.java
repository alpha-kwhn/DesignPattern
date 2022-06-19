//2017112071 김응관
package Week10.P3;

public class MessageBox implements Product{
    private String target;

    public MessageBox(String tmp) {
        target = tmp;
    }

    @Override
    public void Use(String s) {
        System.out.println(target + s + target);
    }

    @Override
    public Product CreateClone() {
        Product stuff = null;
        try {
            stuff = (Product)clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return stuff;
    }
}
