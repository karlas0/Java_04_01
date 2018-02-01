package java04;

import java.util.Scanner;

public class Java_04_02 {
    public Java_04_02() {
        System.out.println("Iveskite betkoki zodi, noredami baigti programa iveskite zodi: pabaiga");
        Scanner sc = new Scanner(System.in);
        String zodis = "";
        while (!zodis.equals("pabaiga")) {
            System.out.println("Iveskite zodi");
            zodis = sc.nextLine();

        }
    }
}
