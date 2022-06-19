package Project.Operation;

import Project.Operation.*;

public class SetOperation {
    public operate setOperation(String type) {
        operate operation = new AddOperation();
        if (type.equals("+")) operation = new AddOperation();
        else if (type.equals("-")) operation = new MinusOperation();
        else if (type.equals("*")) operation = new MultipleOperation();
        else if (type.equals("/")) operation = new DivisionOperation();

        return operation;
    }
}
