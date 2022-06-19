//2017112071 김응관
package Week11.P2;

public class StayOpen implements State{
    private static StayOpen stayopen = new StayOpen();
    private StayOpen() {}

    public static StayOpen getInstance() {
        return stayopen;
    }
    //객체를 한 번만 생성하게끔 싱글톤 패턴을 적용
    @Override
    public void click(Door_1 door) {
        door.setState(Closing.getInstance());
    }

    @Override
    public void complete(Door_1 door) {
    }

    @Override
    public void timeout(Door_1 door) {
    }
}
