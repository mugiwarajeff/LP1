package heranca;

public class Automovel extends Veiculo {
    private String tipo;

    public Automovel(String motor, int nRodas, String tipo){
        super(motor, nRodas);
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String newTipo){
        this.tipo = newTipo;
    }

    @Override
    public void mostra(){
        super.mostra();
        System.out.println("Tipo: " + tipo);
    }
}   
