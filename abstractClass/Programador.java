package abstractClass;

public class Programador extends Funcionario {

    public Programador(String nome, double salario){
        super(nome, salario);
    }

    public String getNome(){
        return super.name;
    }

    public void setNome(String newName){
        super.name = newName;
    }

    public double getSalario(){
        return super.salario;
    }

    public void setSalario(double newSalario){
        super.salario = newSalario;
    }

    public void aumentaSalario(){
        super.salario += 1000;
    }
}
