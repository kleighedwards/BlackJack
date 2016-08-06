package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck extends ArrayList<Card>
{	
	public Deck()
	{
		populateDeck();
		shuffleDeck();
	}

	private void populateDeck()
	{
		for (Suit suit : Suit.values()) 
		{
            for (Rank rank : Rank.values()) 
            {
                this.add(new Card(rank, suit));
            }
        }        
		
	}
	
	Card dealCard()
	{		
		Card cardDealt = this.remove(0);
		
		return cardDealt;
	}
	
	private void shuffleDeck()
	{
		Collections.shuffle(this);
	}
	
	void cardsLeft()
	{
		System.out.println(this.size());
	}
	
	public Deck getDeck() {
		return this;
	}
}