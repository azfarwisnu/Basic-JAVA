
import java.util.Scanner;

public class main {

    public static void main (String[] args) {

            int nilai;
            Scanner inputdata;
            inputdata = new Scanner(System.in);
            System.out.print("Masukan Nilai = ");
            nilai = inputdata.nextInt();
            perulangan(nilai);
            jedah();
            System.out.println("Dijumlah  = " + jumlah(nilai));
            System.out.println("Faktorial = " + faktorial(nilai));
            github();




    }

    private static void github (){
        System.out.println("Source code @@@@");
        System.out.println("github.com/azfarwisnu");
    }

    private static int faktorial (int nilai) {

        if (nilai == 1) {
            return nilai;
        }
        return nilai * faktorial(nilai - 1);
    }

    private static int jumlah (int nilai) {

        if (nilai == 0) {
            return nilai;
        }

        return nilai + jumlah(nilai - 1);
    }

    private static void jedah () {
        System.out.println("====================");
    }

    private static void perulangan (int nilai) {
        System.out.println("perulangan " + nilai);
        if (nilai == 0) {
            return;
        }
        nilai--;
        perulangan(nilai);
    }

}
