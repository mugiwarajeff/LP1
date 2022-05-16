package abstractClass;

public class ContaImposto extends ContaAbstrata {
    
    public ContaImposto(String numero, double saldo){
        super(numero, saldo);
    }

    public void debitar(double valor){
        if (saldo >- valor){
            double TAXA = valor * 0.01;
            saldo -= (valor + (valor * 0.01));
        }else {
            System.out.println("Saldo insuficiente...");
        }
    }
    
}
