package day11_multidimensionalarrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_MultidimensionalArrays {


     /*
 INTERWIEW
Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
0-1-1-2-3-5-8-13-21-34....
*/
     public static void main(String[] args) {
          List<Integer> fibonacci = new ArrayList<>();
          Scanner input = new Scanner(System.in);
          System.out.println("lutfen bir sayi giriniz");
          int sayi = input.nextInt();

          fibonacci.add(0);
          fibonacci.add(1);
          int i = 1;
          if (sayi <= 1) {
               System.out.println("lutfen 1 den buyuk bir sayi giriniz");
          } else {
               while (fibonacci.get(i) < sayi) {
                    fibonacci.add(fibonacci.get(i) + fibonacci.get(i - 1));//bir onceki eleman ile topladik
                    i++;//bir basamak ilerlesin
               }
               if (fibonacci.get(fibonacci.size() - 1) > sayi) {//fibonaccide yer almiyorsa
                    fibonacci.remove(fibonacci.size() - 1);//son elemani sil

                    System.out.println("girdiginiz sayi fibonaccide yer almiyor. Girilen sayiya kadarki fibonachi " + fibonacci);

               } else {
                    System.out.println("girdiginiz sayi bir fibonacci sayisidir " + fibonacci);
               }
          }

     }
}

