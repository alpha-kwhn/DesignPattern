//2017112071 김응관
package Week11.P1;

public class Coffee extends Cafe {

    @Override
    public void addExtra() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public void heatPowder() {
        System.out.println("Dripping Coffee through filter");
    }
}
