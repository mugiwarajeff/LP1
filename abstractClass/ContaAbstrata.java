package abstractClass;

public abstract class ContaAbstrata {
    protected String numero;
    protected double saldo;

    public ContaAbstrata(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public void credita(double newCredit){
        saldo += newCredit;
    }

    public abstract void debitar(double valor);

    public void imprimir(){
        System.out.println("_______________________-");
        System.out.println("Numero da conta: "+ numero);
        System.out.println("Numero da saldo: "+ saldo);
        
    }
}
