package org.dimigo.oop;

public class WapperTest {
    public static void main(String[] args) {
        // wrapper 클래스 : 기본자료형을 객페화 시켜주는 클래스
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(13));

        // Boxing : 기본자료형 데이터 -> wrapper 클래스 객체
        // 생성자 이용
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        // valueOf() 이용
        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf("100");
        Double d1 = Double.valueOf(3.14);
        // unboxing
        int i = i3.intValue();
        double d = d1.doubleValue();

        // 문자열 -> 기본형 : parse()
        int i5 = Integer.parseInt("200");
        double d2 = Double.parseDouble("3.14");

        System.out.println(args);
        // 100 + 200 = 300

        System.out.println(args[0] + args[1]);

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.printf("%d + %d = %d\n", a, b, a + b);

        Integer n1 = 1000;
        Integer n2 = 2000;
        System.out.println(n1 + n2);

        Integer obj = 1000; // autoboxing
        Integer i6 = obj + 100; // autounboxing

        // 총 몇번 autoboxing, autounboxing이 일어나는가
        Integer n3 = 10; // autoboxing 1번
        Integer n4 = n3 + 20; // autoboxing 1번, autounboxing 1번
        Integer result = n1 + n2;   // autoboxing 1번, autounboxing 1번

    }

}