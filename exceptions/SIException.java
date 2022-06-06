package exceptions;

public class SIException extends Exception{
    private double saldo;

    public SIException(double saldo){
        super("Saldo insuficiente...");
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }
}
