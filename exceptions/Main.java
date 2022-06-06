package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ExcecaoAcimaDeCem{
        somar();

    }

    public static void somar() throws ExcecaoAcimaDeCem{
        int xSoma = 0;
        int contLaço = 1;
        boolean whileControl = true;

        while(whileControl){
            int entrada;
            System.out.println("Digite um numero para somar");
            try {
                Scanner keyboard = new Scanner(System.in);
                entrada = keyboard.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Tipo incorreto: insira um numero inteiro");
                entrada = 0;
                System.out.println(xSoma);
            }
        
            xSoma += entrada;

            if(xSoma > 100){
                whileControl = false;
                ExcecaoAcimaDeCem e = new ExcecaoAcimaDeCem();
                throw e;
            }
            System.out.printf("Resutado parcial: %d \nQuantidade de numeros: %d \nMedia: %d\n", xSoma, contLaço, (xSoma / contLaço));

            contLaço++;
            
        }
       
    }
    
}
