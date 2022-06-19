//2017112071 김응관
package Week11.P2;
import java.util.Observable;

public class Door_1 extends Observable {
    private State state = Closed.getInstance();
    //문 최초 상태 정의(닫힌상태)

    public State status() {
        return state;
    }
    //상태 객체 return

    public void setState(State state) {
        this.state = state;
        setChanged();
        notifyObservers();
    }
    //state를 설정하는 메소

    //State객체에 click, complete, timeout 메소드 역할을 위임한다
    public void click() {
        state.click(this);
    }

    public void Complete() {
        state.complete(this);
    }

    public void timeout() {
        state.timeout(this);
    }
}



