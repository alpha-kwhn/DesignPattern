//2017112071 김응관
package com.journaldev.design.composite;

public class Circle implements Shape{
    public Circle(){
    }

    public void draw(String color) {
        String answer = "Drawing Circle with color " + color;
        System.out.println(answer);
    }
}
