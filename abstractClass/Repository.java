package abstractClass;

public class Repository {
    private ContaAbstrata[] BD;
    private int index;
    private static final int MAX = 5;

    public Repository(){
        BD = new ContaAbstrata[MAX];
        index = 0;
    }

    public void insert(ContaAbstrata newConta){
        BD[index] = newConta;
        index ++;
    }

    public void imprimir(){
        for (int i = 0; i < BD.length; i++){
            if (BD[i] != null){
                BD[i].imprimir();
            }else {
                System.out.println("fora do range");
            }
            
        }
    }
}
