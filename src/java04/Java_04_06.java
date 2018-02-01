package java04;

import java.util.Scanner;

public class Java_04_06 {
    String suma = "";
    String masyvas[];

    public Java_04_06() {


        Scanner sc = new Scanner(System.in);
        masyvas = new String[5];
        //loopas for
        for (int i = 0; i < masyvas.length; i++) {
            // kai masyvas [i] = 0, i didink iki masyvo ilgio, ty 5 kartus, didindamas po 1(i++)
            System.out.println("iveskite 5 zodzius");
            String skaicius = sc.next();
            masyvas[i] = skaicius;
            suma = suma + skaicius;
        }
        atvaizdavimas();
    }

    public void atvaizdavimas() {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(" " + masyvas[i]);
        }
        System.out.println();
    }
    }