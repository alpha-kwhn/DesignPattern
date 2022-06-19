package Project;

import Project.WPG.TestSheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        boolean anotherWorksheet = true;
        while (anotherWorksheet) {
            TestSheet worksheet = new TestSheet();
            worksheet.makeProblems();
            worksheet.solveProblems();
            System.out.println("Your final score : " + worksheet.getFinalScore());
            System.out.println("\nWould you like to generate worksheet? Y/N");
            try {
                String input = reader.readLine();
                input = input.replace(" ", "");
                if (!input.equals("Y")) anotherWorksheet = false;
                else i++;
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }
}
