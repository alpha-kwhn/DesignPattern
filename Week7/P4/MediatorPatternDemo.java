//2017112071 김응관
//main 함수를 담은 클래스

package Week7.P4;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();
        User seri = new User();
        User gildong = new User();

        seri.setName("Park Seri");
        seri.sendMessage("Hi!");
        gildong.setName("Gildong");
        gildong.sendMessage("Hello!");

        room.add(seri);
        room.add(gildong);

        room.showMessage();
    }
}
