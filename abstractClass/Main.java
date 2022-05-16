package abstractClass;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");

        Conta c1 = new Conta("123", 0);
        ContaImposto c2 = new ContaImposto("456", 100);
        Poupanca c3 = new Poupanca("789", 200, "123456");
        Repository BD = new Repository();

        // c1.imprimir();
        // c2.imprimir();
        // c3.imprimir();
        BD.insert(c1);
        BD.insert(c2);
        BD.insert(c3);

        BD.imprimir();
    }
}
