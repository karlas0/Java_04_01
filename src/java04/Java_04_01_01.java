package java04;

import java.util.Scanner;

public class Java_04_01_01 {
    public Java_04_01_01() {
        System.out.println("Pirmos uzduoties antra dalis rodoma");
        System.out.println("Iveskite sveika skaiciu");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 7 == 0) {
            System.out.println("Skaicius dalinasi is 7");
        } else {
            if (a % 5 == 0) {
                System.out.println("Skaicius dalinasi is 5");
            } else {
                if (a % 3 == 0) {
                    System.out.println("Skaicius dalinasi is 3");
                } else {
                    System.out.println("Nesidalina is 7, 5, 3");
                }
            }
        }
    }
}
