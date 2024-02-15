import javax.swing.*;

public class utama{
    public static void main(String[]args){        
        int tugas=Integer.valueOf(JOptionPane.showInputDialog("Masukkan nilai tugas"));
        int uts=Integer.valueOf(JOptionPane.showInputDialog("Masukkan Nilai UTS"));
        int uas=Integer.valueOf(JOptionPane.showInputDialog("Masukkan Nilai UAS"));
        proses panggil=new proses();
        panggil.input(tugas, uts, uas);
    }
}