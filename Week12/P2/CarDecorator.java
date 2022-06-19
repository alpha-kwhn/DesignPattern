//2017112071 김응관
package Week12.P2;

public class CarDecorator implements Car{
    protected Car car;

    CarDecorator(Car car){
        this.car = car;
    }
    public void assemble(){
        car.assemble();
    }
}
