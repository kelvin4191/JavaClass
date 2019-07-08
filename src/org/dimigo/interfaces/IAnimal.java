package org.dimigo.interfaces;

public interface IAnimal {
    // 인터페이스 필드 -> 상수 (public static final이 붙음)
    String FARM_NAME = "디미 동물농장";

    // 추상메소드 (public abstract가 붙음)
    //public abstract void eat();
    //abstract void sleep();
    void bark();

    // JDK 8 : 정적 메소드 구현
    static void welcome() {
        System.out.println(FARM_NAME + "에 오신걸 환영합니다");
    }
    // JDK 8 : 디폴트
    default void eat() {
        System.out.println("냠냠");
    }

    default void sleep() {
        System.out.println("쿨쿨");
    }

}
