//2017112071 김응관
package Week10.P5;

import javax.swing.text.Position;
import java.awt.*;
import java.util.*;

class Adventurer {
    private int Hp;
    private int Mp;
    private Position Position;
    private Map CurrentMap;
    private Vector<String> Items;
    private StateSnapshot snapshot;

    public void getState()
    {
            this.CurrentMap = snapshot.getImage();
                    this.Hp = snapshot.getHp();
                    this.Mp = snapshot.getMp();
                    this.Items = snapshot.getItems();
                    this.Position = snapshot.getPosition();
    }

    public StateSnapshot Save(StateSnapshot snapshot)
    {
        return new StateSnapshot(Hp, Mp, Position, CurrentMap, Items);
    }
}


