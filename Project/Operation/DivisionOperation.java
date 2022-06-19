package Project.Operation;

import Project.Information.Information;
import Project.Question.DivisionQuestion;
import Project.Question.Question;

import java.util.ArrayList;

public class DivisionOperation implements operate {
    ArrayList<Integer> numbers;
    Question question;
    int first;
    int second;

    DivisionOperation() {
        question = new DivisionQuestion();
        numbers = new ArrayList<Integer>();
    }

    @Override
    public String QuestionRefactor(Information info) {
        ArrayList<String> list = question.getQuestion();
        String words = list.get(0);

        words = words.replace("(이름1)", info.getStudent());
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
        float result = (float)first / (float) second;
        return result;
    }
}
