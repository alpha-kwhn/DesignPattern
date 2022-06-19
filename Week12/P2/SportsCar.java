//2017112071 김응관
package Week12.P2;

public class SportsCar extends CarDecorator{
    SportsCar(Car car){
        super(car);
    }

    public void assemble(){
        super.assemble();
        System.out.print("Adding feature of Sports Car. ");
    }
}
