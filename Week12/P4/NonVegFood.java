//2017112071 김응관
package Week12.P4;

public class NonVegFood extends FoodDecorator{

    NonVegFood(Food food) {
        super(food);
    }

    public void print(){
        super.print();
        System.out.println("With Roasted Chicken and Chicken Curry");
    }
}
