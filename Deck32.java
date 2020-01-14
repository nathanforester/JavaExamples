class Deck32 {
 public static void main(String[] args) {
  String[] rank = {
	  "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
  };
  String[] suit = {
	  "Clubs", "Diamonds", "Hearts", "Spades"
  };
  String[] deck = new String[32];
  for (int i = 0; i < 8; i++)
	   for (int j = 0; j < 4; j++)
		   deck [4*i + j] = rank[i] + " of " + suit[j];
        {
        for (int i = 0; i < 32; i++)  
	    System.out.println(deck[i]);
	    }
 }
}
	 
	