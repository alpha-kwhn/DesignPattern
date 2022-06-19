package Project.Question;

import java.util.ArrayList;

public class MultipleQuestion extends Question {

    public MultipleQuestion() {
        question = new ArrayList<String>();
        question.add("(이름1)은 (번호1)개의 (항목)을 (번호2)묶음 가지고 있습니다. (이름1)은 전부 (항목)이 몇 개입니까?");
    }
}
