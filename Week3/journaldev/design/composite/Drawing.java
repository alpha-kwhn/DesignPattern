//2017112071 김응관
package com.journaldev.design.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
    private List<Shape> components = new ArrayList<Shape>();
    //복수 개의 Shape 객체를 담은 List 선언

    public Drawing() {
    }
    //생성자 선언

    public void add(Shape shape) {
        components.add(shape);
    }
    //shape 객체를 추가해주는 메소드

    public void remove(Shape shape) {
        components.remove(shape);
    }
    //shape 객체를 제거해주는 메소드

    public void clear() {
        components.clear();
        System.out.println("Clearing all the shapes from drawing");
    }
    //객체 배열을 비워주는 메소드

    @Override
    public void draw(String color) {
        for (Shape comp : components)
            comp.draw(color);
    }
}
    //매개인자에 적힌 color를 바탕으로, 객체배열에 담긴 객체들의 draw 메소드 실행해줌
