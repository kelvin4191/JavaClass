package org.dimigo.oop;

public class StringTest {
    public static void main(String[] args) {
        //1. 문자열 리터링 방식
        String dog1 = "설기";
        String dog2 = "설기";
        System.out.println(dog1 == dog2);

        //2. new 객체 생성 방식
        String cat1 = new String("야옹이");
        String cat2 = new String("야옹이");
        System.out.println(cat1 == cat2);

        //3. 문제
        System.out.println(dog1 == "설기");
        System.out.println(cat1 == "야옹이");

        //4. 문자열 비교시 equals()
        System.out.println(dog1.equals(dog2));
        System.out.println(cat1.equals(cat2));

        String id = "Admin";

        // id가 Admin이면 관리자를 출력하고 아니면 "일반사용자? 출력
        System.out.println(id.equalsIgnoreCase("Admin") ? "관리자":"일반사용자");

        testString();
    }

    private static void testString() {
        //          01234567890123
        String s = "abcdefgABCDEFG";
        System.out.println(s.length());
        System.out.println(s.substring(3));  // defgABCDEFG
        System.out.println(s.substring(3,6));   //def
        System.out.println(s.indexOf("C"));    //9
        System.out.println(s.charAt(7)); // A
        System.out.println(s.concat("ABC")); // abcdefgABCDEFGABC
        System.out.println("   ABC   ".trim()); // ABC ( 스페이스 제거)
        System.out.println(s.toUpperCase()); // ABCDEFGABCDEFG
        System.out.println(s.toLowerCase()); // abcdefgabcdefg
        System.out.println(s.replace('a','A')); //AbcdefgABCDEFG
        System.out.println(s.startsWith("abc")); // true
        System.out.println(s.endsWith("EFG")); /// true
    }
}
