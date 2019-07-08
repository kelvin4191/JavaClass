package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //1. for문
        // 구구단 출력하기

        int i, j;
        for (i = 2; i < 10; i++) {
            for (j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println("\n");
        }

        // BTS 멤버 출력
        String[] bts = {"진", "뷔", "랩몬스터", "슈가", "전정국", "제이홉"};

        // for-each 문으로 출력

        for (String value : bts) {
            System.out.println(value);
        }
        //3. while, do-while
        // 메뉴처리
        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.println("<<아이돌 선택>>");
            System.out.println("1. BTS");
            System.out.println("2.레드벨벳");
            System.out.println("3.여자친구");
            System.out.println("9.종료");
            System.out.println("메뉴입력 =>");

            menu = scanner.nextInt();

            // switch

            switch (menu) {
                case 1:
                    System.out.println("BTS를 선택해셨네요.");
                    break;
                case 2:
                    System.out.println("레드벨벳을 선택해셨네요.");
                    break;
                case 3:
                    System.out.println("여자친구를 선택해셨네요.");
                    break;
                case 9:
                    System.out.println("bye");
                    scanner.close();
                    break;
                default:
                    System.out.println("없는 메뉴네요.");
            }
        } while (menu != 9);

    }
}
