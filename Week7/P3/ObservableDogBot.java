//2017112071 김응관 Object
package Week7.P3;

import java.util.Observable;

public class ObservableDogBot extends Observable implements DogBot{
    private DogBot dog;
    private DogWatcher watch;
    private String name;

    public ObservableDogBot(DogBot dog){
        this.dog = dog;
    }
    //dog의 이름을 받아 객체 생성

    @Override
    //eat 함수실행 & 상태변경 알림
    public boolean eat() {
        if(dog.eat()) {
            setChanged();
            notifyObservers("Eat");
            return true;
        }
        else
            return false;
    }

    @Override
    //Rest 함수실행 & 상태변경알림
    public void rest() {
        dog.rest();
        setChanged();
        notifyObservers("Rest");
    }

    @Override
    //Play 함수실행 & 상태변경알림
    public void play() {
        dog.play();
        setChanged();
        notifyObservers("Play");
    }

    @Override
    //DogBot이 어떤 소리를 내는지 알려줌
    public String noise() {
        return dog.noise();
    }

    //상태 변화가 일어났을 때 객체의 이름을 알려
    public String getName(){
        name = dog.getName();
        return name;
    }
}
