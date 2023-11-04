import javax.swing.JOptionPane;

public class LatihanLooping1{
    public static void main(String[]args){
        int input, i;
        String Input=JOptionPane.showInputDialog("Masukkan banyak bilangan");
        input=Integer.parseInt(Input);
        for(i=1;i<=input;i++){
            System.out.print(i+" ");
        }
    }
}