package Project.Mode;

import java.io.IOException;
import java.util.ArrayList;

public interface Mode {
    ArrayList<String> inputFriends() throws IOException;
    String inputStudent() throws IOException;
    ArrayList<String> inputStuff() throws IOException;
    ArrayList<String> inputOperations() throws IOException;
    int inputQAmount() throws IOException;
    int mini();
    int maxi();
}
