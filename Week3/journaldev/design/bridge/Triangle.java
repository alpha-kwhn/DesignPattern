//2017112071 김응관
package com.journaldev.design.bridge;

public class Triangle extends Shape{
    public Triangle(Color color){
        super(color);
    }
    //부모 클래스로부터 상속받은 color를 Triangle 클래스에서 참조하기 위해 super 키워드를 사용함

    public void applyColor(){
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }
    //Triangle 클래스에 맞게 applyColor() 메소드를 구현함
}
