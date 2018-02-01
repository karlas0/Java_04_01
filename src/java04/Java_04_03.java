package java04;

import java.util.Scanner;

public class Java_04_03 {
    public Java_04_03() {
        System.out.println("Iveskite betkoki skaiciu, skaicius 0 uzbaigia programa");
        Scanner sc = new Scanner(System.in);
        float sk = 0;
        float suma = 0;

        do  {
            System.out.println("Iveskite kita skaiciu");
            sk = sc.nextFloat();
            suma+=sk;
        }while(sk != 0);

        System.out.println("Suma: "+suma);
    }
}
