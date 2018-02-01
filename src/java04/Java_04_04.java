package java04;

import java.util.Scanner;

public class Java_04_04 {
    public Java_04_04() {
        System.out.println("Iveskite betkoki skaiciu, skaicius 0 uzbaigia programa");

        float sk = 0;
        float suma = 0;

        do {
            System.out.println("Iveskite kita skaiciu");
            sk = garantuotasSkaicius();
            suma += sk;
        } while (sk != 0);

        System.out.println("Suma: " + suma);

    }

    public float garantuotasSkaicius(){
        Scanner sc = new Scanner(System.in);
        float rezultatas =0;
        boolean arGerai = false;
        while(arGerai==false){
            try {
                rezultatas=sc.nextFloat();
                arGerai=true;
            }catch (Exception klaida){
                System.out.println("blt sakiau skaiciu");
                sc.next();
            }
        }
        return rezultatas;
    }
}
