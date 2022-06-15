package interfaceGrafica;

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) throws Exception{
        String valor1 = new JOptionPane().showInputDialog("Digite o valor da primeira variavel: ");
        String valor2 = new JOptionPane().showInputDialog("Digite o valora da segunda variavel");

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);
        double soma = numero1 + numero2;

        new JOptionPane().showMessageDialog(null, "O resultado da soma é: " + soma);
        System.out.println(valor1);
    }
}
