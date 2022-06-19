//2017112071 김응관
package Week10.P5;

import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;

class CareTaker {
    private List<StateSnapshot> snapshot = new ArrayList<>();

    public void add(StateSnapshot state) {
        snapshot.add(state);
    }

    public StateSnapshot get(int index) {
        return snapshot.get(index);
    }
}

