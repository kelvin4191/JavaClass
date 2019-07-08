package org.dimigo.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("동물");
        System.out.println(a);
        a.bark();

        Dog d = new Dog("멍멍이");
        System.out.println(d);
        d.bark();
        d.catchBall();

        Cat c = new Cat("야옹이");
        System.out.println(c);
        c.bark();
        c.scratch();

        Tiger t = new Tiger("호랑이");
        System.out.println(t);
        t.bark();
        t.hunt();

        Animal a2 = new Dog("멍멍이");
        Animal a3 = new Cat("야옹이");
        Animal a4 = new Tiger("호랑이");
        a2.bark();
        a3.bark();  // 야옹
        a4.bark();  // 어흥

        Animal[] animals = {
                new Dog("멍멍이"),
                new Cat("야옹이"),
                new Tiger("호랑이")
        };

        for (Animal animal : animals) {
            doBark(animal);
        }

        Animal b = new Dog("멍멍이");
        Animal b2 = new Cat("야옹이");
        Animal b3 = new Tiger("호랑이");

        b.eat();
        b.sleep();
        b.bark();
        Dog dog = (Dog) b;
        dog.catchBall();

        ((Cat) b2).scratch();

        ((Tiger) b3).hunt();

        //instanceof 연산자
        Animal c1 = new Dog("멍멍이");
        Animal c2 = new Cat("야옹이");

        System.out.println(c1 instanceof Dog);
        System.out.println(c2 instanceof Cat);
        System.out.println(c1 instanceof Cat);
        System.out.println(c2 instanceof Dog);
        System.out.println(c1 instanceof Animal);
        System.out.println(c2 instanceof Object);

        doBark(c1);
        doBark(c2);
    }
    private static void doBark(Animal animal) {
        if(animal instanceof  Dog){
        Dog dog = (Dog) animal;
        dog.catchBall();
        }else if(animal instanceof Cat)
            ((Cat) animal).scratch();
    }
}
