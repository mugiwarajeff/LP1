package LP1;
import java.util.Scanner;
public class Curso {
    private String name = null;
    private int code = 0;

    public Curso(){
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.nextLine();
        code = keyboard.nextInt();
    }
    
    public void imprimir(){
        System.out.println("O nome do curso é: " + name);
        System.out.println("O codigo do curso é: " + code);
    }

    public String getName(){
        return name;
    }
}
