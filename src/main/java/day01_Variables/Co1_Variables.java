package day01_Variables;

public class Co1_Variables {

   /* //PROJE OLUSTURMA===>File==>New==>Project==>Next==>Name(Buraya projenin
   ismini yaz kucuk harfle basla javaPractice103104105)==>finish

//PACKAGE OLUSTURMA==>java dosyasina sag click==>New==>Package==>istedigin
 ismi yaz kucuk harfle basla( day01_variables )

//CLASS OLUSTURMA==>olusturdugun
 package uzerine sag click==>New==Class==> istedigin ismi yaz buyuk harfle basla ( C01_Variables )

     Variable
     bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
     Variable icinde deger saklayan bir konteynirdir
   //bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
   //örneğin bir şehrin nufusundan bahsediyorsak variablemızın data türü String,boolean,char veya double alamayız
   //geriye kalan tamsayı  turlerınden şehrin nufusunu içine alabilecek büyüklükte bir data turu seceebiliriz
   //kurs boyunca genelde tam sayılar için int ondalıklı sayılar için double kullanacagız


    */


    public static void main(String[] args) {
        System.out.println("Hello World");

       int level = 1;
        System.out.println(level);
        boolean ogrenciMi= true;
        boolean yagisVarMi = false;
        System.out.println("yagisVarMi="  + yagisVarMi);
        System.out.println("ogrenciMi ="  + ogrenciMi);
        char sembol = '&';
        char ch = '2';
        System.out.println("sembol = " + sembol);
        System.out.println("ch =" + ch);


        long populationWorld = 700000000000L;
        System.out.println("populationWorld=" + populationWorld );


    }
}
