package LP1;

public class ContasArray {
    private Conta [] contasBD = new Conta[3]; 
    private int index; 
    private final static int tamCache = 3; // final static definem o travamento de uma variavel durante toda a execução do programa.

    public ContasArray(){
        index = 0;
        contasBD = new Conta[tamCache];
    }

    public void inserir(Conta conta){
        contasBD[index] = conta;
        index++;
    }

    public Conta acessar(int consultIndex){
        return contasBD[consultIndex];
    }

    public void acessarNumeroConta(int consultIndex){
        contasBD[consultIndex].consultar();
    }

    public void imprimir(){
        for (int i = 0; i < index; i++){
            System.out.println("-----------------");
            contasBD[i].consultar();
        }
    }

    public void deleteByNumero(String numero){
        for (int i = 0; i < index; i++){
            if (contasBD[i].getConta().equals(numero)){
                contasBD[i] = contasBD[index - 1];
                contasBD[index - 1] = null;
                index--;
            }
        }
    }

    public boolean searchByNumero(String numero){
        for (int i = 0; i < index; i++){
            if (contasBD[i].getConta() == numero){
                return true;
            }
        }
        return false;
    }
}
