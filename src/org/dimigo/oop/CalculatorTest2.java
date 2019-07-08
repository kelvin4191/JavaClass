package org.dimigo.oop;

import static org.dimigo.oop.Calculator2.*;

public class CalculatorTest2 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        Calculator2 c = new Calculator2();

        //c.powerOn();
        System.out.printf("%d + %d = %d\n",a,b,add(a,b,c));
        System.out.printf("%d - %d = %d\n",a,b,sub(a,b,c));
        System.out.printf("%d * %d = %d\n",a,b,mul(a,b,c));
        System.out.printf("%d / %d = %.1f\n",a,b,div(a,b,c));
        c.powerOff();
    }
}
