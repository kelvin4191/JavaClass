package org.dimigo.inheritance;

public abstract class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone[] smartPhones = {
                new IPhone("iPhone XS","애플",1370000),
                new Galaxy("갤럭시 S10","삼성",1500000),
        };
        for(SmartPhone smartPhone : smartPhones) {
            System.out.println(smartPhone);
            smartPhone.turnOn();
            smartPhone.pay();
            smartPhone.useSpecialFunction();
            smartPhone.turnOff();
            System.out.println();
        }
    }
}
