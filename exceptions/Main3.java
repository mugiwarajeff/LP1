package exceptions;

public class Main3 {
    public static void main(String[] args) throws SIException {

        Conta c1 = new Conta("123", 100.0);
        Conta c2 = new Conta("456", 200.0);
        try{
            c1.debitar(200.00);
        }catch(SIException e){
            System.out.println(e);
        };
    }
}
