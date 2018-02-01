package java04;

import java.util.Scanner;

public class Java_04_05 {
    int suma = 0;
    int masyvas[];

    public Java_04_05() {
        Scanner sc = new Scanner(System.in);
        masyvas = new int[5];
        //loopas for
        for (int i = 0; i < masyvas.length; i++) {
            // kai masyvas [i] = 0, i didink iki masyvo ilgio, ty 5 kartus, didindamas po 1(i++)
            System.out.println("iveskite skaiciu");
            int skaicius = sc.nextInt();
            masyvas[i] = skaicius;
            suma = suma+skaicius;
        }
        atvaizdavimas();
    }

    public void atvaizdavimas() {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(" " +masyvas[i]);
        }
        System.out.print("skaiciu suma "  +suma);
        System.out.println();
    }
}