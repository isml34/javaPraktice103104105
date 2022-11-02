package day07_stringmanipulations;

import java.util.Scanner;

public class C07_StringManipulationsIsEmpty {
    public static void main(String[] args) {
        /**
         * StringIsEmpty
         *  String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false
         */
        String str1 = "Hi";
        System.out.println("str1 içi boş mu = " + str1.isEmpty()); //false
        String str2 = "";
        System.out.println("hiclik boş mu = " + str2.isEmpty()); //true
        String str3 = " ";
        System.out.println("space boş mu = " + str3.isEmpty());  //false
        boolean bosMu = str3.isEmpty(); // boolean değişkenine atanabilir.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Cumle Giriniz");
        String str4 = input.nextLine();
        System.out.println(str4.isEmpty());
        if(str4.isEmpty()){
            System.out.println("boş");
        }else
            System.out.println("değil");
    }
}
