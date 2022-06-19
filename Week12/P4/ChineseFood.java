//2017112071 김응관
package Week12.P4;

public class ChineseFood extends FoodDecorator{
    ChineseFood(Food food) {
        super(food);
    }

    public void print(){
        super.print();
        System.out.println("With Fried Rice and Manchurian");
    }
}
