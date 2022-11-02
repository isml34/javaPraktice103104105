package day03_ifstatement;

public class C04_MantikOperatorleri {

    // && ile & arasindaki fark
    //&& de boolean sonuc 3 te bir tane false bulunca durur tum satırı kontrol etmeye calısmaz.
    // Ancak & tum satırı kontrol eder ondan sonra durur.
    //sonucta fark yok sadece biri ilk hatayı buldugunda durur dığeri sonuna kadar gider.&& tekliye gore daha hizli calisir
    public static void main(String[] args) {
        System.out.println(5+2==8);//false
        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc1 ==> "+sonuc1);//true


        boolean sonuc2=5>4 & 7>9 & 6+3==9 & 5+2!=8;
        System.out.println("sonuc2 = " + sonuc2);//false
        int sayi1=15;
        // sayi1'un ' 10 ile 20 araliginda oldugunu true diyerek dondurelim
        //10<sayi1<20  Java uclu karsilastirma yapmaz
        //Ikili karsilastirmalar yapip Mantiksal Operatorlar ile birlestirmeliyiz.
        System.out.println(10<sayi1 && sayi1<20);//true


        int sayi2=15;
        //sayi2 'nin 10 ile 20 'nin arasinda olmadigini true diyerek donduren bir kod yaziniz
        System.out.println(sayi2<10 || sayi2>20);//false
        //&&==ve  ||=veya
        //5 6 7 8 9 10  11 12 ...........20
    }
}
