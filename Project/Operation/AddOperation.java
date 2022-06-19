package Project.Operation;

import Project.Information.Information;
import Project.Question.AddQuestion;
import Project.Question.Question;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class AddOperation implements operate {
    Question question;
    int first;
    int second;

    AddOperation() {
        question = new AddQuestion();
    }

    public String QuestionRefactor(Information info) {
        ArrayList<String> list = question.getQuestion();
        String sentence = list.get(0);

        sentence=sentence.replace("(이름1)",info.getStudent());
        sentence=sentence.replace("(이름2)",info.getRandomFriend());
        sentence=sentence.replace("(항목)",info.getRandomStuff());

        first = info.getRandomNumber();
        second = info.getRandomNumber();
        sentence=sentence.replace("(숫자1)",Integer.toString(first));
        sentence=sentence.replace("(숫자2)",Integer.toString(second));

        return sentence;
    }


    public float calculate() {
        int result = first + second;
        DecimalFormat form = new DecimalFormat("0.00");
        return Float.parseFloat(form.format(result));
    }
}
