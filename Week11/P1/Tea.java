//2017112071 김응관
package Week11.P1;

public class Tea extends Cafe{

    @Override
    public void addExtra() {
        System.out.println("Adding Lemon");
    }

    @Override
    public void heatPowder() {
        System.out.println("Steeping the tea");
    }
}
