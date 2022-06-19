//2017112071 김응관
package Week11.P2;

public class Closed implements State {
    private static Closed closed = new Closed();
    private Closed() {}

    public static Closed getInstance() {
        return closed;
    }
    //객체를 한 번만 생성하게끔 싱글톤 패턴을 적용

    @Override
    public void click(Door_1 door) {
        door.setState(Opening.getInstance());
    }

    @Override
    public void complete(Door_1 door) {
    }

    @Override
    public void timeout(Door_1 door) {
    }
}
