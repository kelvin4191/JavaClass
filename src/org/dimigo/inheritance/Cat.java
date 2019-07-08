package org.dimigo.inheritance;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }
    // 부모클래스의 bark()를 자식클래스에서 재정의
    // -> 메소드 오버라이딩(overriding)
    public void bark() {
        System.out.println("야옹");
    }

    public void scratch() {
        System.out.println(name + "이/가 할큅니다.");
    }

}
