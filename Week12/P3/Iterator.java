//2017112071 김응관
package Week12.P3;

public interface Iterator<E>{
    void reset();   // reset to the first element
    E next();   // To get the next element
    E currentItem();    // To retrieve the current element
    boolean hasNext();  // To check whether there is any next element or not.

}
