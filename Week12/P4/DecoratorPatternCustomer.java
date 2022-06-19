//2017112071 김응관
package Week12.P4;
import java.util.Scanner;

public class DecoratorPatternCustomer {
    public static void main(String[] args) {

        while(true){
            System.out.println("========= Food Menu ============");
            System.out.println("1. Vegetarian Food.");
            System.out.println("2. Non-Vegetarian Food.");
            System.out.println("3. Chinese Food.");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            if(choice == 1){
                Food veg = new VegFood();
                veg.print();
                System.out.println("50.0");
            }

            else if(choice == 2){
                Food non_veg = new NonVegFood(new VegFood());
                non_veg.print();
                System.out.println("200.0");
            }

            else if(choice == 3){
                Food china = new ChineseFood(new VegFood());
                china.print();
                System.out.println("115.0");
            }

            else
                break;
        }
    }
}
