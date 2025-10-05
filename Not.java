package Pratik;
import java.util.Scanner;
public class Not {
    public static void main (String[] args) {
     // Degiskenleri olustur
     int cal,phy,tdb,dif,data;

     // Scanner sinifimizi tanimladik.
     Scanner inp = new Scanner(System.in);

     // Kullanicidan degerleri al
        System.out.print("Calculus notunuz: ");
        cal = inp.nextInt();

        System.out.print("Physics notunuz: ");
        phy = inp.nextInt();

        System.out.print("Turk dili notunuz: ");
        tdb = inp.nextInt();

        System.out.print("Diferansiyel notunuz: ");
        dif = inp.nextInt();

        System.out.print("Data structure notunuz: ");
        data = inp.nextInt();

        int toplam =(cal+phy+tdb+dif+data);
        double sonuc = toplam / 5;
        System.out.println(sonuc);

    }
}
