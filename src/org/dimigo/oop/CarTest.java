package org.dimigo.oop;

public class CarTest {
    public static void main(String[] args) {
        String[] company = {"현대자동차","기아자동차","삼성자동차"};
        String[] model = {"제네시스","K7","SM7"};
        String[] color = {"검정","흰색","회색"};
        int[] maxSpeed = {225,246,200};
        int[] price = {50000000,40000000,38000000};
        System.out.println("<< 자동차 목록 >>");
        for(int i=0;i<3;i++) {
            System.out.printf("제조사명 : %s\n",company[i]);
            System.out.printf("모델명 : %s\n",model[i]);
            System.out.printf("색상 : %s\n",color[i]);
            System.out.printf("최대속도 : %skm\n",maxSpeed[i]);
            System.out.printf("가격 : %,d원\n",price[i]);
            System.out.println("\n");
        }
    }
}
