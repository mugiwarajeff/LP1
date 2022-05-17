package yugioh;

public class Trap extends Card {
    private String property;

    public Trap(String name, String property){
        super(name);
        this.property = property;
    }

    public void print(){
        System.out.printf("Nome: %s\nPropriedade: %s", this.name, this.property);
    }
}
