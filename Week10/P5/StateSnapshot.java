//2017112071 김응관
package Week10.P5;

import javax.swing.text.Position;
import java.awt.*;
import java.util.Vector;
import java.util.Map;
public class StateSnapshot {
    private int Hp;
    private int Mp;
    private Position Position;
    private Map CurrentMap;
    private Vector<String> Items;

    public StateSnapshot(int Hp, int Mp, Position Position, Map CurrentMap, Vector<String> Items){
        this.Hp = Hp;
        this.Mp = Mp;
        this.Position = Position;
        this.CurrentMap = CurrentMap;
        this.Items = Items;
    }

    public int getHp(){
        return Hp;
    }

    public int getMp(){
        return Mp;
    }

    public Position getPosition(){
        return Position;
    }

    public Map getImage(){
        return CurrentMap;
    }

    public Vector<String> getItems() {
        return Items;
    }
}

