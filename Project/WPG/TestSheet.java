package Project.WPG;

import Project.Information.Information;
import Project.WPG.WordProblemGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class TestSheet {
    private ArrayList<WordProblemGenerator> Questions;
    private Integer finalScore;

    public TestSheet() {
        Questions = new ArrayList<WordProblemGenerator>();
        finalScore = 0;
    }

    public void makeProblems() throws IOException {
        Information info = new Information();
        info.getInformation();

        for (String operation : info.getOperations()) {
            for (int i = 0; i < info.getQuestionNum(); i++) {
                Questions.add(new WordProblemGenerator(info, operation));
            }
        }

        for (WordProblemGenerator problem : Questions) {
            problem.makeContent();
        }
    }

    public void solveProblems() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        Collections.shuffle(Questions);

        for (int i = 0; i < Questions.size(); i++) {
            WordProblemGenerator p = Questions.get(i);
            System.out.println((i + 1) + ". " + p.getContent());
            try {
                input = br.readLine();
                input = input.replace(" ", "");
                Float answer = Float.parseFloat(input);
                if (answer.equals(p.getAnswer())) {
                    System.out.println("Correct answer\n");
                    finalScore += p.getScore();
                } else System.out.println("Wrong answer \n");
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }

    public int getFinalScore(){
        return finalScore;
    }
}