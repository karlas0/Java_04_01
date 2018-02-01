package Java_04_01;

import java.util.Scanner;

public class Java_04_01 {
    public Java_04_01() {
        System.out.println("Pirma uzduotis rodoma");
        System.out.println("Iveskite skaiciu");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Skaicius yra lyginis");

        } else {
            System.out.println("Skaicius nelyginis");
        }
    }
}