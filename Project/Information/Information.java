package Project.Information;

import java.io.IOException;
import java.util.ArrayList;
import Project.Mode.Mode;
import Project.Mode.CmdMode;
import java.util.Random;

public class Information {
    private ArrayList<String> friends; //중요한 사람들 이름
    private ArrayList<String> stuff; //소중한 물건
    private ArrayList<String> operations; //연산 종류
    private int QAmount; //문제 수
    private int min; //최소 범위
    private int max; // 최대 범위
    private String student; //학생 이름


    public void getInformation() throws IOException {
        Mode mode = new CmdMode();
        friends = mode.inputFriends();
        stuff = mode.inputStuff();
        operations = mode.inputOperations();
        QAmount = mode.inputQAmount();
        min = mode.mini();
        max = mode.maxi();
        student = mode.inputStudent();
    }

    public String getRandomFriend() {
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        int target = rand.nextInt(friends.size());
        return friends.get(target);
    }

    public String getRandomStuff() {
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        int target = rand.nextInt(stuff.size());
        return stuff.get(target);
    }

    public int getRandomNumber() {
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        int target = rand.nextInt(max - min) + min;
        return target;
    }

    public String getStudent() {
        return student;
    }

    public ArrayList<String> getOperations() { return operations; }

    public int getQuestionNum() { return QAmount; }
}
