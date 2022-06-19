//2017112071 김응관
package Week10.P3;

public interface Product extends Cloneable{
    public abstract void Use(String s);
    public abstract Product CreateClone();
}
