package heranca;

public class Veiculo {
    protected String motor;
    protected int nRodas;

    public Veiculo(String motor, int nRodas){
        this.motor = motor;
        this.nRodas = nRodas;
    }

    public int getNRodas(){
        return this.nRodas;
    }

    public void setNRodas(int newNumRodas){
        this.nRodas = newNumRodas;
    }

    public void mostra(){
        System.out.printf("Motor: %s\nNumero de rodas: %d\n", motor, nRodas);
    }
}
