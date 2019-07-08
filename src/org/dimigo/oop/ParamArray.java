package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        add(intArr,10);
        printArray(intArr);// 11, 12, 13, 14, 15

        String[] strArr = {"홍길동","홍길남","홍길서","홍길북"};
        changename(strArr,"김");
        printArray(strArr);
    }

    private static void printArray(String[] strArr) {
        for(String value : strArr) {
            System.out.print(value + " | ");
        }
        System.out.println();
    }

    private static void changename(String[] strArr, String familyname) {
        for(int i=0;i<strArr.length;i++) {
            strArr[i] = familyname + strArr[i].substring(1);
            strArr[i] = strArr[i].replace('홍','김');
        }
    }

    private static void printArray(int[] intArr) {
        for(int value : intArr) {
            System.out.print(value+" | ");
        }
        System.out.println();
    }

    private static void add(int[] intArr,int num) {
        for(int i=0;i<intArr.length;i++) {
            intArr[i] += num;
        }
    }
}
