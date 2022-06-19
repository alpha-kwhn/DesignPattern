//2017112071 김응관 - 옵저버
package Week7.P3;

import java.util.Observable;
import java.util.Observer;

public class DogWatcher implements Observer {
    private String name;

    public DogWatcher(String k){
        name = k;
    }
    //오브젝트의 이름을 name 변수에 저장함

    //update 되었음을 알림
    @Override
    public void update(Observable o, Object arg) {
        DogBot dog = (DogBot) o;
        System.out.println(dog.getName() + "  state  " + arg);
    }
}
