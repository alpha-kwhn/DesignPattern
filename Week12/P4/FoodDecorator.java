//2017112071 김응관
package Week12.P4;

public class FoodDecorator implements Food{
    protected Food food;

    FoodDecorator(Food food){
        this.food = food;
    }

    @Override
    public void print() {
        food.print();
    }
}
