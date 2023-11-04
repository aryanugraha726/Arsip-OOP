import javax.swing.JOptionPane;
public class LatihanLooping2 {
    public static void main(String[]args){
        int Saldoawal, Tsaldo, Bunga, Waktu, i, Bbertahap;

        String Sawal=JOptionPane.showInputDialog("Saldo Awal");
        Saldoawal=Integer.parseInt(Sawal);
        String Bnga=JOptionPane.showInputDialog("Bunga");
        Bunga=Integer.parseInt(Bnga);
        String Wktu=JOptionPane.showInputDialog("Waktu");
        Waktu=Integer.parseInt(Wktu);

        for(i=1;i<=Waktu;i++){
            Bbertahap=Saldoawal*Bunga/100;
            Tsaldo=Saldoawal+Bbertahap;
            System.out.println("Saldo Bulan "+i+ " "+Tsaldo);
            Saldoawal=Tsaldo;
        }
    }
}
