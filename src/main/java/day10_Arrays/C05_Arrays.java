package day10_Arrays;

public class C05_Arrays {
     /*
                Interwiew Sorusu
                Ogrencilerin test sonuclarini degerlendiren Java kodunu method kullanarak yaziniz
                //10 sorumuz var
                //ogrencilerin cevaplari
                char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
                *
                * // cevap anahtari
                char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

                output:
                1 nolu ogrencinin dogru cevap sayisi :7
                2 nolu ogrencinin dogru cevap sayisi :6
                3 nolu ogrencinin dogru cevap sayisi :5
                4 nolu ogrencinin dogru cevap sayisi :4
                5 nolu ogrencinin dogru cevap sayisi :8
                6 nolu ogrencinin dogru cevap sayisi :7
                7 nolu ogrencinin dogru cevap sayisi :7
                8 nolu ogrencinin dogru cevap sayisi :7
*/

    public static void main(String[] args) {
//        for (int i = 0; i < answers.length ; i++) {
//            for (int j = 0; j < keys.length; j++) {
//                if (answers[i][j]==keys[j]) {
//                    counter++;
//                }
//            }
//            System.out.println((i + 1) + " nolu ogrencinin dogru cevap sayisi : " + counter);
//            counter=0;
//
//        }

        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
                  testsonucu(answers,keys);


    }

    private static void testsonucu(char[][] answers, char[] keys) {

        for (int i = 0; i < answers.length ; i++) {
            int counter = 0;
            for (int j = 0; j < keys.length; j++) {
                if (answers[i][j]==keys[j]) {
                    counter++;
                }
            }
            System.out.println((i + 1) + " nolu ogrencinin dogru cevap sayisi : " + counter);
            counter=0;

        }
        
        
    }


}
