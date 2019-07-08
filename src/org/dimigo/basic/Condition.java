package org.dimigo.basic;

import java.util.Random;

public class Condition {
    public static void main(String[] args) {
        // if문
        // 선거권 연령 : 만 19세
        int age = 17;

        //만 19세 이상이면 "투표하러 갑시다!" , 아니면 "선거권이 없네요" 출력

        if (age >= 19)
            System.out.println("투표하러 갑시다");
        else
            System.out.println("선거권이 없네요");

        //switch문
        //주사위 랜덤뽑기(1~6)
        System.out.println(new Random().nextInt(6) + 1);

        int num = new Random().nextInt(6) + 1;

        //num이 짝수면 "짝수입니다", 홀수면 "홀수입니다". 출력

        switch (num % 2) {
            case 0:
                System.out.println("짝수입니다.");
                break;
            case 1:
                System.out.println("홀수입니다.");
                break;
            default:
                ;
        }
        String menu = "짜장면";

        switch (menu) {
            case "짜장면":
                System.out.println("짜장면 선택");
                break;
            case "짬뽕":
                System.out.println("짬뽕 선택");
                break;
            default:
                System.out.println("난 다이어트 중");
        }
    }
}
