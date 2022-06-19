//2017112071 김응관
package Week11.P1;

public abstract class Cafe {

    public void prepareRecipe() {
        boilWater();
        pourInCup();
        addExtra();
        heatPowder();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    //Hook Methods
    public abstract void addExtra(); //우유 or 설탕 넣기와 레몬넣기라는 유사한 행위를 하나로 추상화 함
    public abstract void heatPowder();//티백과 커피가루에 열을 준다는 유사한 행위를 하나로 추상화 함
}
