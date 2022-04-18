package LP1;

public class Produto {
    private String description;
    private Double valor;
    private int quant;

    public String getDescription(){
        return this.description;
    }

    public Double getValor(){
        return this.valor;
    }
    public int getQuant(){
        return this.quant;
    }

    public void setDescription(String tempDescription){
        this.description = tempDescription;
    }

    public void setValor(Double tempValor){
        this.valor = tempValor;
    }
    public void setQuant(int tempQuant){
        this.quant = tempQuant;
    }

}
