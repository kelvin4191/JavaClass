package org.dimigo.abstractclass;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car(new BenzEngine());
        car.start();
        car.stop();
        System.out.println("==엔진 교체==");
        car.setEngine(new BmwEngine());
        car.start();
        car.stop();
    }
}
