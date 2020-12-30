import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        int[] arraya = {4,3,2,1};
        int[] arrayb = {5,4,6,1};
        int[] arrayhasil =   tambaharray(arraya, arrayb);


        // call array and plus
        kumpularray(arraya , "array 1");
        kumpularray(arrayb,  "array 2");
        System.out.println("========================== +");
        kumpularray(arrayhasil, "array hasil");


        System.out.println("============= Space ============ ");
        //call array sort
        kumpularray(arraya, "Asal Array 1");
        sortarray(arraya, "di sort menjadi ");
        kumpularray(arrayb, "Asal Array 2");
        sortarray(arrayb, "di sort menjadi ");


        //sort and plus
        System.out.println("============= Space ============ ");
        int[] sortarrayhasil = sortarrayplus(arraya, arrayb);
        sortarray(arraya, "array 1 di sort");
        sortarray(arrayb, "array 2 di sort");
        System.out.println("========================== +");
        sortarray(sortarrayhasil,"Dijumlahkan menjadi ");

    }

    //sort array

    private static void sortarray (int[] array, String pesan) {
       Arrays.sort(array);
        System.out.println ( pesan + " " + Arrays.toString(array));
    }

    private static int[] sortarrayplus (int[] array1, int[] array2) {
        int[] hasilsort = new int[array1.length];
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i < array1.length; i++) {
            hasilsort[i] = array1[i] + array2[i];
        }
        return hasilsort;
    }


    // method + array
    private static int[] tambaharray (int[] array1, int[] array2) {
        int[] hasil = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            hasil[i] = array1[i] + array2[i];
        }
        return  hasil;
    }


    // method encrypt array to string
    private static void kumpularray (int[] array, String message) {

        System.out.println(message  +" " + Arrays.toString(array));


    }

  }
