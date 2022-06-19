package Project.Mode;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Collections;

public class CmdMode implements Mode {
    private BufferedReader buffer;

    public CmdMode() {
        buffer = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public ArrayList<String> inputFriends() throws IOException {
        System.out.print("자녀에게 중요한 사람들의 이름을 입력하시오: ");
        ArrayList<String> friend = new ArrayList<String>();
        String input = buffer.readLine();
        String[] results = input.split(",");
        friend.addAll(Arrays.asList(results));
        return friend;
    }

    @Override
    public String inputStudent() throws IOException {
        System.out.print("학생의 이름을 입력하시오: ");
        String student = buffer.readLine();
        return student;
    }

    @Override
    public ArrayList<String> inputStuff() throws IOException {
        System.out.print("자녀가 관심 갖고 있는 항목들을 입력하시오: ");
        String input = buffer.readLine();
        String[] results = input.split(",");
        ArrayList<String> stuff = new ArrayList<String>(Arrays.asList(results));
        return stuff;
    }

    @Override
    public ArrayList<String> inputOperations() throws IOException {
        ArrayList<String> operations = new ArrayList<String>();
        System.out.println("연산의 종류를 하나 이상 입력하세요.\n" +
                "Ex) *+/-");
        try {
            String input = buffer.readLine();
            input = input.replace(" ", "");
            String[] inputList = input.split("");
            Collections.addAll(operations, inputList);
        } catch (IOException e) {
            System.err.println(e);
        }
        return operations;
    }

    @Override
    public int inputQAmount() throws IOException {
        System.out.print("원하시는 문제의 수를 입력해주세요: ");
        String num = buffer.readLine();
        int questionNum = Integer.parseInt(num);
        return questionNum;
    }

    @Override
    public int mini() {
        int min = 0;
        System.out.println("최솟값 입력 : ");
        try {
            String input = buffer.readLine();
            input = input.replace(" ", "");
            min = Integer.parseInt(input);
        } catch (IOException e) {
            System.err.println(e);
        }
        return min;

    }

    @Override
    public int maxi() {
        int max = 0;
        System.out.println("사용될 숫자의 최대값을 정해주세요.");
        try {
            String input = buffer.readLine();
            input = input.replace(" ", "");
            max = Integer.parseInt(input);
        } catch (IOException e) {
            System.err.println(e);
        }
        return max;
    }
}
