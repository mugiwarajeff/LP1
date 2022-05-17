package yugioh;

public class Main {
    public static void main(String[] args){
        System.out.println("hello world!");

        Monster m1 = new Monster("Mago negro", 5, "Nenhum", "Feiticeiro", "Dark");
        Trap t1 = new Trap("Força Espelho", "Resposta");
        Spell s1 = new Spell("Buraco Negro", "Sei lá");

        Deck dk = new Deck();

        dk.insertCard(m1);
        dk.insertCard(t1);
        dk.insertCard(s1);

        dk.removeByInstance(t1);
        dk.ShowTheDack();
    }
}
