package day07_stringmanipulations;

public class C09_StringManipulations {
    /*
                Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                            i)En az 8 character icermeli
                            ii)Space characteri icermemeli
                            iii)Buyuk harf icermemeli
                            iv)Son characteri "." olmali
         */
    public static void main(String[] args) {
        String pwd = "java1234*4.";
        //i)En az 8 character icermeli
        boolean kural1 = pwd.length() > 7;
        //ii)Space characteri icermemeli
        boolean kural2 = !pwd.contains(" ");
        //iii)Buyuk harf icermemeli
        boolean kural3 = pwd.replaceAll("[^A-Z]","").length()==0 ;
        //iv)Son characteri "." olmali
        boolean kural4 = pwd.charAt(pwd.length() - 1) == '.';
        System.out.println(kural1 && kural2 && kural3 && kural4);//true
    }
}
