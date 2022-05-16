package abstractClass;

public class Poupanca extends Conta {
    private String matricula;

    public Poupanca(String numero, double saldo, String matricula){
        super(numero, saldo);
        this.matricula = matricula;
    }


    public void imprimir(){
        super.imprimir();
        System.out.println("Matricula: " + matricula);
    }
}
