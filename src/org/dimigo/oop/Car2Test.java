package org.dimigo.oop;

public class Car2Test {
    public static void main(String[] args) {
        Car2 car = new Car2("현대자동차","제네시스","검정색",225,50000000);
        Car2 car2 = new Car2("기아자동차","K7","흰색",246,40000000);
        Car2 car3 = new Car2("삼성자동차","SM7","회색",200,38000000);

        System.out.println("<< 자동차 목록 >>\n");
        System.out.printf("제조사명 : %s\n",car.getCompany());
        System.out.printf("모델명 : %s\n",car.getModel());
        System.out.printf("색상 : %s\n",car.getColor());
        System.out.printf("최대속도 : %dkm\n",car.getMaxSpeed());
        System.out.printf("가격 : %,d원\n", car.getPrice());
        System.out.println("\n");

        System.out.printf("제조사명 : %s\n",car2.getCompany());
        System.out.printf("모델명 : %s\n",car2.getModel());
        System.out.printf("색상 : %s\n",car2.getColor());
        System.out.printf("최대속도 : %dkm\n",car2.getMaxSpeed());
        System.out.printf("가격 : %,d원\n", car2.getPrice());
        System.out.println("\n");

        System.out.printf("제조사명 : %s\n",car3.getCompany());
        System.out.printf("모델명 : %s\n",car3.getModel());
        System.out.printf("색상 : %s\n",car3.getColor());
        System.out.printf("최대속도 : %dkm\n",car3.getMaxSpeed());
        System.out.printf("가격 : %,d원\n", car3.getPrice());
    }
}
