//2017112071 김응관
package com.journaldev.design.composite;

public class Triangle implements Shape {
    public Triangle(){
    }

    public void draw(String color){
        String answer = "Drawing Triangle with color " + color;
        System.out.println(answer);
    }
}
