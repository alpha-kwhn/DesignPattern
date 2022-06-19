//2017112071 김응관
package com.journaldev.design.bridge;

public abstract class Shape {
    Color color;
    //Color 인터페이스와 집약 관계에 있으므로 참조를 위한 객체를 생성한다.

    public void applyColor() {
    }

    public Shape(Color color){
        this.color = color;
    }
}
