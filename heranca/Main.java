package heranca;

public class Main {
    public static void main(String[] args){
        Veiculo v1 = new Veiculo("v8", 6);
        Automovel a1 = new Automovel("V4", 4, "Conversivel");

        v1.mostra();
        a1.mostra();
    }
}
