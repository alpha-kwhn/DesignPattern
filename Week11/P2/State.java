//2017112071 김응관
//문의 다양한 State들을 캡슐화하여 인터페이스 형식으로 정의
package Week11.P2;

public interface State {
    void click(Door_1 door);
    void complete(Door_1 door);
    void timeout(Door_1 door);
}
