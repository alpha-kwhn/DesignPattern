//2017112071 김응관
package Week9.P3;

public class MotorFactory {
    public static Motor getCompany(String company){
        Motor motor = null;

        if(company == null)
            return null;
        else if(company == "LG"){
            motor = LGMotor.getInstance();
            return motor;
        }
        else if(company == "Hyundai"){
            motor = HyundaiMotor.getInstance();
            return motor;
        }

        return null;
    }
}
