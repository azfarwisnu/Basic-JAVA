import javax.swing.*;

public class joptines {

    public static void main(String[] args) {

        double panjang,lebar,tinggi,hasil;
        //@WISNUAZFAR

        panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukan Panjang CM : "));
        lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukan lebar CM : "));
        tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukan Tinggi CM : "));
        hasil = volumebalok(panjang,lebar,tinggi);
        JOptionPane.showMessageDialog(null, "Volume hasil : " + hasil + "CM \n @wisnuazfar");
        nama();

    }

    public static double volumebalok (double panjang, double lebar, double tinggi) {
        double volume;
        volume = panjang * lebar * tinggi;
        return volume;
    }


    public  static void nama () {

        JOptionPane.showMessageDialog(null,"Code By Muhammad Azfar Wisnu");
    }

}
