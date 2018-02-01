package com.company;

import java04.Java_04_01;
import java04.Java_04_01_01;
import java04.Java_04_02;

import java.util.Scanner;

public class Main {

    public static final int EXIT_CODE = 0;
    public static final int ACTION_1 = 1;
    public static final int ACTION_2 = 2;
    public static final int ACTION_3 = 3;

    public static void main(String[] args) {
        Main objektas = new Main();
        objektas.vykdykProgramaBeGalo();
        // write your code here
    }

    private void rodykPasirinkimus() {
        System.out.println("===============================");
        System.out.println("Koki veiksma norite atlikti");
        System.out.println(EXIT_CODE + " - Baigti darba");
        System.out.println(ACTION_1 + " - java04");
        System.out.println(ACTION_2 + " - Java_04_01_01");
        System.out.println(ACTION_3 + " - Java_04_02");
        System.out.println("===============================");
    }

    public void vykdykProgramaBeGalo() {
        boolean arTesti = true;
        Scanner sc = new Scanner(System.in);
        while (arTesti == true) {
            rodykPasirinkimus();
            int veiksmas = sc.nextInt();
            switch (veiksmas) {
                case (EXIT_CODE):
                    arTesti = false;
                    break;
                case ACTION_1:
                    new Java_04_01();
                    break;
                case ACTION_2:
                    new Java_04_01_01();
                    break;
                case ACTION_3:
                    new Java_04_02();
                    break;
            }

        }
    }
}
