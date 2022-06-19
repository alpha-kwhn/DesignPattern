package Project.Operation;

import Project.Information.Information;
import Project.Question.MultipleQuestion;
import Project.Question.Question;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MultipleOperation implements operate {
    Question question;
    int first;
    int second;

    MultipleOperation() {
        question = new MultipleQuestion();
    }

    @Override
    public String QuestionRefactor(Information info) {
        ArrayList<String> list = question.getQuestion();
        String words = list.get(0);

        words = words.replace("(이름1)", info.getStudent());
        words = words.replace("(항목)", info.getRandomStuff());

        first = info.getRandomNumber();
        second = info.getRandomNumber();
        words = words.replace("(번호1)", Integer.toString(first));
        words = words.replace("(번호2)", Integer.toString(second));

        return words;
    }

    public float calculate() {
        int result = first * second;
        DecimalFormat form = new DecimalFormat("0.00");
        return Float.parseFloat(form.format(result));
    }
}
