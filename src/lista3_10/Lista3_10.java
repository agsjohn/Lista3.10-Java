package lista3_10;

import javax.swing.JOptionPane;

public class Lista3_10 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
        int cont = 0, cont2 = 0;
        for(int x = 1; x <= num; x++){
            cont = num % x;
            if(cont == 0){
                cont2++;
            }
        }
        if(cont2 == 2){
            JOptionPane.showMessageDialog(null, "O número "+num+" é primo");
        } else{
            JOptionPane.showMessageDialog(null, "O número "+num+" não é primo");
        }
    }    
}
