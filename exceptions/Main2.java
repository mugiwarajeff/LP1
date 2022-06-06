package exceptions;

public class Main2 {
    public static void main(String[] args){
        System.out.println("Inicio do método");
        metodo1();
        System.out.println("Fim do método");
    }

    public static void metodo1(){
        System.out.println(("Aqui estamos no metodo 1"));
        metodo2();
        System.out.println(("Fim do metodo 1"));
    }

    public static void metodo2(){
        System.out.println("Aqui estamos no metodo 2");

        int [] matriz = new int[10];

        try{
            for (int i = 0; i < 15; i++){
                matriz[i] = i;
                System.out.println("valor de i: " + i);
            }
        }catch(ArrayIndexOutOfBoundsException e ){
            System.out.println((e));
        }catch(Exception e ){
            System.out.println("qual erro: " + e);
        }
        System.out.println("Fim do metodo 2");
    }
} 