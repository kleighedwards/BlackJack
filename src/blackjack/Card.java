package blackjack;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Card 
{
	private Rank rank;
	private Suit suit;
		
	public Card(Rank rank, Suit suit)
	{
		this.rank = rank;
		this.suit = suit;
		
		assignValueToRank();
	}
	
	@Override
	public String toString() {
		return rank + " of " + suit;
	}

	int assignValueToRank()
	{
		Map<Rank, Integer> values = new HashMap<>();
		
		values.put(Rank.TWO, 2);
		values.put(Rank.THREE, 3);
		values.put(Rank.FOUR, 4);
		values.put(Rank.FIVE, 5);
		values.put(Rank.SIX, 6);
		values.put(Rank.SEVEN, 7);
		values.put(Rank.EIGHT, 8);
		values.put(Rank.NINE, 9);
		values.put(Rank.TEN, 10);
		values.put(Rank.JACK, 10);
		values.put(Rank.QUEEN, 10);
		values.put(Rank.KING, 10);
		values.put(Rank.ACE, 11);
		
		Set<Rank> value = values.keySet();
		for (Rank rank : value)
		{
			values.get(rank);
		}
		
		return values.get(rank);
	}
}
