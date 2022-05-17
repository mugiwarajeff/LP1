package yugioh;


public class Monster extends Card{
    private int levelStar;
    private String effect;
    private String raca;
    private String attribute;

    public Monster(String name, int levelStar, String effect, String raca, String attribute){
        super(name);
        this.levelStar = levelStar;
        this.effect = effect;
        this.raca = raca;
        this.attribute = attribute;
    }

    public void print(){
        System.out.printf("Nome: %s\nNivel: %d\nEfeito: %s\nRaça: %s\nAtributo: %s", this.name, this.levelStar, this.effect, this.raca, this.attribute);
    }
}
