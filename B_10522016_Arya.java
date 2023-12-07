//NIM       : 10522016
//Nama      : Arya Nugraha
//Kode Soal : B
import javax.swing.JOptionPane;
public class B_10522016_Arya{
    public static void main(String[]args) {
        String[] nama=new String[10];
        String[] kode_item=new String[10];
        String[] nama_item={"handphone","External Memory","Modem\t"};
        int[] jumlah=new int[10];
        int[] harga={400000,100000,300000};
        int i=0;
        do {
            nama[i] = JOptionPane.showInputDialog("Nama Pelanggan");
            kode_item[i] = JOptionPane.showInputDialog("Kode item (H001/E002/M003)");
            jumlah[i] = Integer.valueOf(JOptionPane.showInputDialog("Jumlah"));
            i++;
            String ulang = JOptionPane.showInputDialog("Apakah mau tambah data lagi? Y/T");
            if (!ulang.equalsIgnoreCase("y")) {
                break;
            }
        } while (i < 10);
        System.out.println("=======================================================================");
        System.out.println("No\tNama Pelanggan\tNama Item\tJumlah\tHarga\tTotal Bayar");
        System.out.println("=======================================================================");
        for (int j = 0; j < i; j++) {
            int index;
            switch (kode_item[j].toUpperCase()) {
                case "H001":
                    index = 0;
                    break;
                case "E002":
                    index = 1;
                    break;
                case "M003":
                    index = 2;
                    break;
                default:
                    index = -1;
            }
            if (index != -1) {
                int totalBayar = jumlah[j] * harga[index];
                System.out.println((j + 1)+"\t"+nama[j]+"\t\t"+nama_item[index]+"\t"+jumlah[j]+"\t"+harga[index]+"\t"+totalBayar);
            }
        }
        System.out.println("=======================================================================");
    }
}
