//2017112071 김응관
package Week11.P2;

public class Open implements State {
    private static Open open = new Open();
    private Open() {}

    public static Open getInstance() {
        return open;
    }
    //객체를 한 번만 생성하게끔 싱글톤 패턴을 적용

    @Override
    public void click(Door_1 door) {
        door.setState(StayOpen.getInstance());
    }

    @Override
    public void complete(Door_1 door) {

    }

    @Override
    public void timeout(Door_1 door) {
        door.setState(Closed.getInstance());
    }
}
