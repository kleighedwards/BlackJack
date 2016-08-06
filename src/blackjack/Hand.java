package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand extends ArrayList<Card> 
{
	Deck deck;
	
	public Hand(Deck deck)
	{
		this.deck = deck;
		
	}
	
	void addCard(Card card)
	{
		this.add(deck.dealCard());
	}
	
	void getCardsInHand()
	{
		for (Card card : this) 
		{
			System.out.println(card);
		}
	}
	
	int getValueOfHand()
	{
		int value = 0;
		for (Card card : this) 
		{
			value = value + card.assignValueToRank();
		}
		
		return value;
	}
	
	int numberOfCards()
	{
		return this.size();
	}
}
