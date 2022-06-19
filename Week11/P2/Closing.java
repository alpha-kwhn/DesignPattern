//2017112071 김응관
package Week11.P2;

public class Closing implements State{
    private static Closing closing = new Closing();
    private Closing() {}

    public static Closing getInstance() {
        return closing;
    }
    //객체를 한 번만 생성하게끔 싱글톤 패턴을 적용
    @Override
    public void click(Door_1 door) {
        door.setState(Opening.getInstance());
    }

    @Override
    public void complete(Door_1 door) {
        door.setState(Closed.getInstance());
    }

    @Override
    public void timeout(Door_1 door) {
    }
}
