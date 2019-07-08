package org.dimigo.inheritance;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super();
    }

    public void catchBall() {
        System.out.println(name + "이/가 공을 물어옵니다.");
    }
}
