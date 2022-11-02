package day07_stringmanipulations;

public class C04_StringManipulationsStartsWith {
    /**
     * startsWith()
     *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
     *
     * endsWith()
     * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
     */
    public static void main(String[] args) {
        String cumle="Kazananlar hic hata yapmayanlar degil,vazgecmeyenlerdir";
        //Ka ile basliyor mu?
        System.out.println(cumle.startsWith("Ka"));//true
        //dir ile bitiyor mu?
        System.out.println(cumle.endsWith("dir"));//true
    }
}
