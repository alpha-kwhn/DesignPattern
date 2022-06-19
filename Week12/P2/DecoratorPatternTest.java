//2017112071 김응관
package Week12.P2;

import Week12.P2.BasicCar;
import Week12.P2.Car;
import Week12.P2.LuxuryCar;
import Week12.P2.SportsCar;


public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar())); sportsLuxuryCar.assemble();
    }
}
