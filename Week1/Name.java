//Basics 3
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String fName, String mName, String lName) {
        firstName = fName;
        middleName = mName;
        lastName = lName;
    }

    public Name(String fName, String lName) {
        firstName = fName;
        lastName = lName;
    }

    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }

    public void setFirstName(String fn) {
        firstName = fn;
    }
    public void setMiddleName(String mn) {
        middleName = mn;
    }
    public void setLastName(String ln) {
        lastName = ln;
    }

    public String getFirstAndLastName() {
        return firstName + " " + lastName;
    }

    public String getFirstMiddleLastName() { return firstName + " " + middleName.substring(0,1) + " " + lastName; }

    public String getLastCommaFirst() { return lastName + ", "+ firstName; }

    public String getFullName() {
        String tmp = "";
        tmp += getFirstName();
        tmp += " ";

        if(middleName == null) {
            tmp += getLastName();
            return tmp;
        }

        else {
            tmp += getMiddleName().substring(0, 1);
            tmp += " ";
            tmp += getLastName();
            return tmp;
        }
    }

    public String getInits() {
        if (middleName == null) {
            String a = getFirstName().substring(0, 1);
            String c = getLastName().substring(0, 1);
            return a + c;
        }
        else {
            String a = getFirstName().substring(0, 1);
            String b = getMiddleName().substring(0, 1);
            String c = getLastName().substring(0, 1);
            return a + b + c;
        }
    }
}

