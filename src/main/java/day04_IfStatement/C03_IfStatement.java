package day04_IfStatement;

import java.util.Locale;
import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
        System.out.println("Lutfen Gun Ismi giriniz");


        //1 Yol..
//        String gun = input.next().toLowerCase();
//        if (gun.equals("cuma")){
//            System.out.println("Musulmanlar icin kutsal gun");
//        }
//        if (gun.equals("cumartesi")){
//            System.out.println("Yahudiler icin kutsal gun");
//        }
//        if (gun.equals("pazar")){
//            System.out.println("Hiristiyanlar icin kutsal gun");
//        }
//        if (!gun.equals("cuma") && !gun.equals("cumartesi") && !gun.equals("cpazar")){
//            System.out.println("kUTSAL GUN DEGIL");
//
//        }
        //2 YOL...

        //3 Yol
        String gun = input.next().toLowerCase(Locale.ROOT);
        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        } else if (gun.equals("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");

        } else  System.out.println("Kutsal Gun degil");


    }

}
