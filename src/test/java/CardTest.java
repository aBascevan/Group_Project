/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jon Paul Cortez
 */
import com.mycompany.app.Card;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Disabled;

public class CardTest {

    @Test
    public void testGetSuit() {
        Card card = new Card("Hearts", "Ace");
        assertEquals("Hearts", card.getSuit());
    }

    @Test
    public void testGetRank() {
        Card card = new Card("Diamonds", "King");
        assertEquals("King", card.getRank());
    }
    
    @Test
    public void testToString() {
        Card card = new Card("Clubs", "7");
        assertEquals("7 of Clubs", card.toString());
    }
    
    

}

