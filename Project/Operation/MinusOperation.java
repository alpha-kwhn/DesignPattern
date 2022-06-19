package Project.Operation;

import Project.Information.Information;
import Project.Question.MinusQuestion;
import Project.Question.Question;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MinusOperation implements operate {
    ArrayList<Integer> numbers;
    Question question;
    int first;
    int second;

    MinusOperation() {
        question = new MinusQuestion();
        numbers = new ArrayList<Integer>();
    }

    @Override
    public String QuestionRefactor(Information info) {
        ArrayList<String> list = question.getQuestion();
        String words = list.get(0);

        words = words.replace("(이름1)", info.getStudent());
        words = words.replace("(이름2)",info.getRandomFriend());
        words = words.replace("(항목)", info.getRandomStuff());

        first = info.getRandomNumber();
        second = info.getRandomNumber();
        check(first, second);

        words = words.replace("(숫자1)", Integer.toString(numbers.get(0)));
        words = words.replace("(숫자2)", Integer.toString(numbers.get(1)));

        return words;
    }

    public ArrayList<Integer> check(int first, int second){
        if (second >= first) {
            numbers.add(second);
            numbers.add(first);
        }
        else{
            numbers.add(first);
            numbers.add(second);
        }
        return numbers;
    }

    public float calculate() {
        int result = first - second;
        DecimalFormat form = new DecimalFormat("0.00");
        return Float.parseFloat(form.format(result));
    }
}
