package LP1;
import java.util.Scanner;


public class Aluno {
    private String name = null;
    private String cpf = null;
    private int idade = 0;
    private Curso curso;

    public Aluno(Curso cursoAluno){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno:");
        name = keyboard.nextLine();

        System.out.println("Digite o CPF do aluno: ");
        cpf = keyboard.nextLine();

        System.out.println("Digite a idade do aluno: ");
        idade = keyboard.nextInt(); 

        System.out.println("Informe qual o curso do aluno: ");
        curso = cursoAluno;

        keyboard.close();
    }

    public void mostraAluno(){
        System.out.printf("O Aluno: %s\ntem o CPF: %s\ncom idade de: %d\n", name, cpf, idade);
        curso.imprimir();
    }
}
