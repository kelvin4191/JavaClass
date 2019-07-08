package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        String[] src = {"서울","대전","대구","부산"};

        // 배열 출력
        System.out.println(Arrays.toString(src));

        // 배열복사
        String[] dest = Arrays.copyOf(src,src.length);
        System.out.println(Arrays.toString(dest));

        // 배열비교
        System.out.println(Arrays.equals(src,dest));

        // 배열정렬
        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));

        // 배열검색
        System.out.println(Arrays.binarySearch(dest,"부산"));
    }
}
