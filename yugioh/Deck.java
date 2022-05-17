package yugioh;

import javax.security.auth.login.CredentialException;

public class Deck {
    private int index;
    private Card[] deck;
    private final int MAX_CARD = 60;

    public Deck(){
        index = 0;
        deck = new Card[MAX_CARD];
    }

    public void insertCard(Card newCard){
        deck[index] = newCard;
        index++;
    }

    public void removeByInstance(Card removedCard){
        for (int i = 0; i < deck.length; i++){
            if (deck[i] == removedCard){
                for ( int j = i; j < index; j++){
                    deck[j] = deck[j + 1];
                }
            index--;
            }
        }
    }

    public void searchByInstance(Card searchedCard){
        for (int i = 0; i < deck.length; i++){
            if (deck[i] == searchedCard){
                System.out.println("Achamos a sua carta!!");
                System.out.println("=====================");
                deck[i].print();
            }
        }
    }

    public void ShowTheDack(){
        for(int i = 0; i < deck.length; i++){
            if (deck[i] != null){
                System.out.println("Carta --> " + i + 1);
            System.out.println("=================");
            deck[i].print();
            }else {
                continue;
            }
            
        }
    }
}
