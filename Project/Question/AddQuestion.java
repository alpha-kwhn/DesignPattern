package Project.Question;

import java.util.ArrayList;

public class AddQuestion extends Question {

    public AddQuestion() {
        question = new ArrayList<String>();
        question.add("(이름1)은 (항목)을 (숫자1)개 가지고 있습니다. (이름2)은 (항목)을 (숫자2)개 가지고 있습니다." +
                "그들이 가지고 있는 (항목)은 모두 몇 개입니까?");
    }
}
