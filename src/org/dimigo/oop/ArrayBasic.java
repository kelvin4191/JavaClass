package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        //기본형 배열
        //int, float, double, byte, boolean, short, char, long
        int[] intArr = null;
        intArr = new int[5];

        printArray(intArr);

        //double 타입 5개짜리 배연 만들고 출력
        double[] doubleArr = new double[5];

        printArray(doubleArr);

        int[] intArr2 = {1, 2, 3, 4, 5};
        int[] intArr3 = new int[]{1, 2, 3, 4, 5};
        printArray(intArr2);
        printArray(intArr3);

        //참조형 배열
        //String, Book, Car, StringBuilder, Scanner, Random...

        String[] strArr = new String[3];
        printArray(strArr);

        strArr[0] = "중궈";
        strArr[1] = "기제";
        strArr[2] = "문학";

        printArray(strArr);

        String[] strArr2 = {"강지윤", "유승서", "정민욱"};
        printArray(strArr2);

        //Book 타입 2개짜리 배열
        //Book 객체 생성 후 출력

        Book[] bookArr = new Book[2];
        bookArr[0] = new Book("미생","윤태호",100);
        bookArr[1] = new Book("자바의 신","나자바",200);
        printArray(bookArr);

        Book[] bookArr2 = new Book[] {
                new Book("미생","윤태호",100),
                new Book("자바의 신","나자바",200)
        };

        // 배열사용시 주의사항
        int[] intArr4 = null;
        System.out.println(intArr4.length);

        intArr4 = new int[3];
        System.out.println(intArr4.length);
        System.out.println(intArr4.length-1);

        String[] strArr3 = new String[3];
        System.out.println(strArr3[0].length());
























        Book[] bookArr3 = new Book[3];
        System.out.println(bookArr3[0].getTitle());


    }

    private static void printArray(String[] strArr) {
        for (String value : strArr) {
            System.out.print(value + " | ");
        }
        System.out.println(" ");
    }

    private static void printArray(double[] doubleArr) {
        for (double value : doubleArr) {
            System.out.print(value + " | ");
        }
        System.out.println(" ");
    }

    private static void printArray(int[] intArr) {
        for (int value : intArr) {
            System.out.print(value + " | ");
        }
        System.out.println(" ");
    }
    private static void printArray(Book[] bookArr) {
        for (Book book : bookArr) {
            System.out.println(book);
        }
        System.out.println(" ");
    }
}