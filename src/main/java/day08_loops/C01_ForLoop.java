package day08_loops;

public class C01_ForLoop {
    //Kullanicidan baslangic , bitis ve artis miktarini alarak
    // aradaki tum sayilari aralarina virgul koyarak yazdirin
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        int baslangic=10;
        int bitis=50;
        int artisMiktari=5;
        for (int i = baslangic; i <=bitis ; i+=artisMiktari) {
            if(i<bitis){
                System.out.print(i+",");
            }else
                System.out.println(i);
        }
    }
}
