package Week9.P3;

public class Client {
    public static void main(String[] args) {
        MotorFactory factory = new MotorFactory();

        Motor motor1 = factory.getCompany("LG");
        ElevatorController controller1 = new ElevatorController(1, motor1);
        controller1.gotoFloor(5);
        controller1.gotoFloor(3);

        Motor motor2 = factory.getCompany("Hyundai");
        ElevatorController controller2 = new ElevatorController(1, motor2);
        controller2.gotoFloor(4);
        controller2.gotoFloor(6);
    }
}
