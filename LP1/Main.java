package LP1;

public class Main {
    public static void main(String[] args){
        //Curso BSI = new Curso();
        //Aluno a1 = new Aluno(BSI);
        Conta c1 = new Conta("001", 0);
        Conta c2 = new Conta("002", 0);
        Conta c3 = new Conta("003", 0);
        // Alocação estatica
        //Conta [] contasBD1 = {c1, c2, c3};

        ContasArray BD = new ContasArray();

        BD.inserir(c1);
        BD.inserir(c2);
        BD.inserir(c3);

        System.out.println(BD.acessar(0));
        BD.acessarNumeroConta(0);
        BD.imprimir();
        System.out.println(BD.searchByNumero("001"));
    }
}

