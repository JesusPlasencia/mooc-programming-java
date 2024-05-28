
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JESUS
 */
public class Hand {
    
    private List<Card> hand;
    
    public Hand () {
        this.hand = new ArrayList<Card>();
    }
    
    public void add (Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        Iterator<Card> iterator = hand.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
}
