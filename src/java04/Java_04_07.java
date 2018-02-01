package java04;

import java.util.Scanner;

public class Java_04_07 {
    static int suma = 0;
    static int masyvas[];

    public Java_04_07() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite kiek skaiciu norite ivesti");
        int a = sc.nextInt();
        masyvas = new int[a];
        //loopas for
        for (a = 0; a < masyvas.length; a++) {
            // kai masyvas [i] = 0, i didink iki masyvo ilgio, ty 5 kartus, didindamas po 1(i++)
            System.out.println("iveskite skaicius");
            int skaicius = sc.nextInt();
            masyvas[a] = skaicius;
            suma = suma + skaicius;
        }
        atvaizdavimas();
    }

    public void atvaizdavimas() {
        for (int a = 0; a < masyvas.length; a++) {
            if (masyvas[a] <= 100) {
                System.out.println(masyvas[a]);
            } else {
                System.out.println("skaicius turi buti mazesnis uz 100");

            }
        }
    }
}