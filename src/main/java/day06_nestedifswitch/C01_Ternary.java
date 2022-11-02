package day06_nestedifswitch;

import java.util.Scanner;

public class C01_Ternary {
    /*
       TASK :
        Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
        Girilen pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
        3 basamaklı degilse çift olup olmadigini kontrol edin.
        Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
        Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
        */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz...");
        int sayi=input.nextInt();
        System.out.println();
        System.out.println("**********TERNARY ile Cozum*************");
        String sonuc=(sayi>0)       ? (sayi>99 && sayi<1000)    ?   ("3 basamakli 0'dan buyuk sayi") ://0'dan buyuk 3 bas.Sayilari inceledik
                (sayi%2==0)     ? ("3 basamakli olmayan cift sayi") : ("3 basamakli olmayan tek sayi") ://0'dan buyuk 3 bas.olmayan sayilarin cift mi tek mi baktik
                "Lutfen sifirdan buyuk bir sayi giriniz";// 0 ve sifirdan kucuk olma ihtimalini inceledik
        System.out.println(sonuc);
        System.out.println("***** if else ******************");
        if (sayi > 0) {
            if(sayi<1000 &&sayi>99){
                System.out.println("3 Basamakli pozitif sayi");
            }else if(sayi%2==0){
                System.out.println("3 basamakli olmayan cift sayi");
            }else
                System.out.println("3 basamakli olmayan tek sayi");
        }else System.out.println("Lutfen sifirdan buyuk pozitif bir tamsayi giriniz");
    }

}
