package abstractClass;

public abstract class Funcionario{
    protected String name;
    protected double salario; 

    public Funcionario(String name, double salario){
        this.name = name;
        this.salario = salario;
    }

    public abstract String getNome();

    public abstract void setNome(String newName);

    public abstract double getSalario();

    public abstract void setSalario(double newSalario);

    public abstract void aumentaSalario();

}