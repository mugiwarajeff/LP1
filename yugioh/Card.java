package yugioh;

public abstract class Card {
    protected String name;

    public Card(String name){
        this.name = name;
    }

    public abstract void print();
}
