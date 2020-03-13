import java.util.Random;
class Card
{
public static String[] shuffleCardsDeck(String[] arr)
{
	//RANDOM FUNCTION IS USE TO GIVE A RANDOM CARDS TO PLAYER
	Random random = new Random();
	int f1, f2;
	String temp;
	for (int i = 0; i < 52; i++)
	{
		f1 = random.nextInt(51);
		f2 = random.nextInt(51);
		if (f1 != f2)
		{
			temp = arr[f1];
			arr[f1] = arr[f2];
			arr[f2] = temp;
		}
	}
	return arr;

}
}
public class DeckOfCard {

	public static void main(String[] args) {
		Card c=new Card();
		//SUITS
		String[] cardType = { "Clubs", "Diamonds", "Hearts", "Spades" };
		
		//CARD NUMBER
		String[] cardNumbers = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		
		String[] cardsArray = new String[52];
		
		int start = 0, end = 12, j1 = 0;
		// FOR COMBINATION OF CARDTYPE AND CARDNUMBER
		for (int i = 0; i < 4; i++)
		{
			for (int j = start; j <= end; j++) 
			{
				cardsArray[j] = cardType[i] + " " + cardNumbers[j1];
				j1++;
			}
			j1 = 0;
			start = end + 1;
			end += 13;
		}
		c.shuffleCardsDeck(cardsArray);
		System.out.println("**************************************************************************************************************************");
		// PRINTING CARDS FOR 4 PLAYERS
		int j2 = 0;
		for (int i = 1; i <=4; i++) 
		{
			System.out.print("For Player " + i + ": \n");
			int count=1;
				for (int j = 1; j <= 9; j++) 
				{
					System.out.print(count+")"+cardsArray[j2]+"  ");
					j2++;
					count++;
				}
				System.out.println();
				System.out.println("********************************************************************************************************");
		}

}
		

}