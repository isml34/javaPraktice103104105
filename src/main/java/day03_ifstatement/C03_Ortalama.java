package day03_ifstatement;

public class C03_Ortalama {
    /*
       double num1 = 23.4;
       double num2 = 24.0;
       double num3 = 12;
       double num4 = 450.3;
       double num5 = 23000;
       bu double sayilarin ortalamasini bulan bir kod yaziniz
    */
    public static void main(String[] args) {
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;

        double toplam=num1+num2+num3+num4+num5;

        double ortalama=toplam/5;
        System.out.println("ortalama = " + ortalama);
    }
}
