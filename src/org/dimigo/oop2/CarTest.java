package org.dimigo.oop2;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("제네시스"),
                new Car("에쿠스"),
                new Car("그랜저")
        };

        for(Car car : cars){
            System.out.println(car);
        }
    }
}