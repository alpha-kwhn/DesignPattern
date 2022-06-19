//2017112071 김응관
package Week12.P2;

public class LuxuryCar extends CarDecorator{
    LuxuryCar(Car car){
        super(car);
    }
    public void assemble(){
        super.assemble();
        System.out.print("Adding feature of Luxury Car. ");
    }
}
