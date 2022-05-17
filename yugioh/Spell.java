package yugioh;

public class Spell extends Card{
    private String type;

    public Spell(String name, String type){
        super(name);
        this.type = type;
    }

    public void print(){
        System.out.printf("Nome: %s\nTipo: %s", this.name, this.type);
    }
    
}
