//2017112071 김응관
package Week9.P3;

enum Direction {UP, DOWN}
enum MotorStatus {MOVING, STOPPED}

public abstract class Motor {

    private MotorStatus motorStatus;
    protected abstract void moveMotor(Direction direction);

    public Motor() {
        motorStatus = MotorStatus.STOPPED;
    }
    public MotorStatus getMotorStatus() {
        return motorStatus;
    }
    public MotorStatus stop() {
        this.motorStatus = MotorStatus.STOPPED;
        return this.motorStatus;
    }
    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }
    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING)
            return;
        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }
}

