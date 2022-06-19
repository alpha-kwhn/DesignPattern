//2017112071 김응관
package Week12.P3;

public class ConcreteIterator implements Iterator{
    private Topic[] group;
    private int index;

    public ConcreteIterator(Topic[] group){
        this.group = group;
        this.index = 0;
    }

    @Override
    public void reset() {
        index = 0;
    }

    @Override
    public Object next() {
        return group[index++];
    }

    @Override
    public Object currentItem() {
        return group[index];
    }

    @Override
    public boolean hasNext() {
        if(index < group.length)
            return true;
        else
            return false;
    }
}
