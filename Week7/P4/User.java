//채팅방에 참여하는 객체들을 선언해주는 클래스
//2017112071 김응관
package Week7.P4;

public class User {
    private String name;
    private String halo;
    //User의 이름과 인사말 담는 변수

    public User(){
    }

    public String getName() {
        return name;
    }
    //유저 이름 return

    public void setName(String name) {
        this.name = name;
    }
    //유저 이름 세팅

    public String sendMessage(String insa) {
        halo = insa;
        return halo;
    }
    //인사말 설정

    public String getHalo() {
        return halo;
    }
    //인사말 return
}
