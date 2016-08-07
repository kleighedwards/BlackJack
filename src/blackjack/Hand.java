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
	
	int aceInHand()
	{
		int numAces = 0;
		
		for (Card card : this) 
		{
			if (card.getRank() == Rank.ACE)
			{
				numAces++;
			}
		}
		
		return numAces;
	}
	
	int getValueOfHand()
	{
		int value = 0;
		for (Card card : this) 
		{
			value = value + card.assignValueToRank();
		}
		
		if (value > 21 && this.aceInHand() > 0)
		{
			value = (value - (this.aceInHand()) * 10);
		}
		
		return value;
	}
	
	int numberOfCards()
	{
		return this.size();
	}
}
