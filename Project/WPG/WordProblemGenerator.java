package Project.WPG;

import Project.Information.Information;
import Project.Operation.SetOperation;
import Project.Operation.operate;


public class WordProblemGenerator {
    private String operation;
    private Information info;
    private String content;
    private float answer;
    private int score;

    public WordProblemGenerator(Information info, String operation) {
        this.info = info;
        this.operation = operation;
    }

    public void makeContent() {
        SetOperation setter = new SetOperation();

        operate op = setter.setOperation(operation);
        content = op.QuestionRefactor(info);
        answer = op.calculate();
        score = 1;
    }

    public String getContent() {
        return content;
    }

    public float getAnswer() {
        return answer;
    }

    public int getScore() {
        return score;
    }
}
