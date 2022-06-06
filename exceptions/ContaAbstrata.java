package exceptions;

public abstract class ContaAbstrata {
    protected String numero;
    protected double saldo;

    public ContaAbstrata(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public abstract void debitar(double saldo) throws SIException;
}
