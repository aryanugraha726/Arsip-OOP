import javax.swing.JOptionPane;
public class LatihanPercabangan {
    public static void main(String[] args) {
        System.out.println("|   Kelas/jurusan   |   Bandung   |   Jakarta   |");
        System.out.println("|      Bisnis       |    40000    |    60000    |");
        System.out.println("|      Ekonomi      |    20000    |    64000    |");
        String nama, jurusan, kelas;
        int jumlah, harga, total;
        int bandungB = 40000, bandungE = 20000, jakartaB = 60000, jakartaE = 40000;
        nama = JOptionPane.showInputDialog("Masukkan nama");
        jurusan = JOptionPane.showInputDialog("Jurusan yang dituju");
        kelas="";
        harga=0;
        if (jurusan.equalsIgnoreCase("Bandung")) {
            kelas = JOptionPane.showInputDialog("Pilih kelas Bisnis/Ekonomi");
            if (kelas.equalsIgnoreCase("bisnis")) {
                kelas="bisnis";
                harga = bandungB;
            } else if (kelas.equalsIgnoreCase("ekonomi")) {
                kelas="ekonomi";
                harga = bandungE;
            }
        }
        else if (jurusan.equalsIgnoreCase("Jakarta")) {
            kelas = JOptionPane.showInputDialog("Pilih kelas Bisnis/Ekonomi");
            if (kelas.equalsIgnoreCase("bisnis")) {
                kelas="bisnis";
                harga = jakartaB;
            } else if (kelas.equalsIgnoreCase("ekonomi")) {
                kelas="ekonomi";
                harga = jakartaE;
            }
        }
        else{
            System.out.println("Jurusan yang dimasukkan tidak valid");
        }
        String jumlahString = JOptionPane.showInputDialog("Jumlah tiket");
        jumlah = Integer.parseInt(jumlahString);
        total = harga * jumlah;
        System.out.println("Nama          = " + nama);
        System.out.println("Jurusan       = " + jurusan);
        System.out.println("Kelas         = " + kelas);
        System.out.println("Jumlah tiket  = " + jumlah);
        System.out.println("Harga         = " + harga);
        System.out.println("Jumlah bayar  = " + total);
    }
}
