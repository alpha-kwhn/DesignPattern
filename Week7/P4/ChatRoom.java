//2017112071 김응관 - 중재자
package Week7.P4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatRoom{
    private User k;
    private List<String> user;
    private List<String> hey;

    public ChatRoom() {
        user = new ArrayList<String>();
        hey = new ArrayList<String>();
    }
    //유저들의 이름과 인사말을 담는 배열리스트를 생성한다

    public void add(User person) {
        String name = person.getName();
        String hi = person.getHalo();
        user.add(name);
        hey.add(hi);
    }
    //유저들 이름과 인사말을 배열리스트에 추가시켜주는 메소드

    //최종적으로 문제에서 요구하는 채팅 인사말을 형식에 맞게 출력시켜주는 메소드
    public void showMessage() {
        Date today = new Date();

        for (int i = 0; i < user.size(); i++) {
            String tmp = user.get(i);
            String hi = hey.get(i);
            System.out.print(today);
            System.out.println(" [" + tmp + "] " + " : " + hi + ' ' + tmp);
        }
    }
}
