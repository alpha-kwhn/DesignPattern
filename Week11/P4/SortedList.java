//2017112071 김응관
package Week11.P4;

import java.util.ArrayList;

public class SortedList {
    private SortStrategy sort;
    private ArrayList<String> list = new ArrayList<String>();

    public void setSortStrategy(SortStrategy sortStr) {
        sort = sortStr;
    }

    public void sort(){
        sort.sort(list);
    }

    public void add(String str) {
        list.add(str);
    }
}
