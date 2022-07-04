package interfacee;

public class CanetaEsferografica implements Caneta, Lapis{
    private String cor;

    public CanetaEsferografica(String cor){
        this.cor = cor;
    }

    public void escrever(String texto){
        System.out.println("Escrevendo " + texto + " a caneta");
    }

    public String getCor(){
        return this.cor;
    }
    
}
