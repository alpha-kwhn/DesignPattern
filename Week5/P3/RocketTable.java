//2017112071 김응관
package Week5.P3;

import javax.swing.table.*;

public class RocketTable extends AbstractTableModel {
    protected Rocket[] rockets;
    protected String[] columnNames =
            new String[] { "Name", "Price", "Apogee" };

    public RocketTable(Rocket[] rockets) {
        this.rockets = rockets;
    }

    //columnName이 들어있는 배열의 길이를 반환한다.
    public int getColumnCount() {
        return columnNames.length;
    }

    //columnNames 배열에서 원하는 index의 columName을 반환한다.
    public String getColumnName(int i) {
        return columnNames[i];
    }

    //rocket 객체 배열의 길이가 곧 행의 길이이므로 이를 반환한다.
    public int getRowCount() {
        return rockets.length;
    }

    //열이 0일 땐 rocket 객체 배열의 해당 행의 이름을 반환한다.
    //열이 1일 땐 rocket 객체 배열의 해당 행의 가격을 반환한다.
    //열이 2일 땐 rocket 객체 배열의 해당 apogee를 반환한다.
    public Object getValueAt(int row, int col) {
        if(col == 0)
            return rockets[row].getName();

        else if(col == 1)
            return rockets[row].getPrice();

        else
            return rockets[row].getApogee();
    }
}

