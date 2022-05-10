package LP1;
import java.util.Scanner;

public class Conta {
    private String conta;
    private double saldo;

    public Conta(String conta, double saldo){
        this.conta = conta;
        this.saldo = saldo;
    }
   

    public Conta(){
        Scanner keyboard = new Scanner(System.in);
        conta = keyboard.nextLine();
        saldo = keyboard.nextDouble();
    }

    public String getConta(){
        return this.conta;
    }
    public void creditar(double valor){
        saldo += valor;
    }

    public void debitar(double valor){
        if (saldo + valor > 0){
            saldo -= valor;
        }else {
            System.out.println("Não é possivel deposotar ");
        }
    }

    public void consultar(){
        System.out.println("O valor em conta é:" + saldo);
    }
}