//2017112071 김응관
package Week11.P2;

public class Opening implements State {
    private static Opening opening = new Opening();
    private Opening() {}

    public static Opening getInstance() {
        return opening;
    }
    //객체를 한 번만 생성하게끔 싱글톤 패턴을 적용

    @Override
    public void click(Door_1 door) {
        door.setState(Closing.getInstance());
    }

    @Override
    public void complete(Door_1 door) {
        door.setState(Open.getInstance());
    }

    @Override
    public void timeout(Door_1 door) {
    }
}
