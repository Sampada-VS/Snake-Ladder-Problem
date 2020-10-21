class Player {
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;

	public int play(int playerPosition) {
		
		int diceNum = ((int)((Math.random()*10)%6))+1;
		int playOption = (int)((Math.random()*10)%3);
			
		switch (playOption) {
			case NO_PLAY :	
				break;
			case LADDER :
				playerPosition = playerPosition + diceNum;
				play(playerPosition);
				break;
			case SNAKE :
				playerPosition = playerPosition - diceNum;
				break;
		}
		if (playerPosition < 0)
			playerPosition = 0;
		if (playerPosition > 100)
			playerPosition = playerPosition - diceNum;
		return playerPosition;
	}
}
public class SnakeLadder {
	public static void main(String[] args) {
		int player1Position = 0;
		int player2Position = 0;
		Player player1=new Player();
		Player player2=new Player();

		while (player1Position < 100 && player2Position < 100) {
			player1Position = player1.play(player1Position);
			player2Position = player2.play(player2Position);
		}
		if (player1Position == 100)
			System.out.println("Player1 wins the game.");
		else
			System.out.println("Player2 wins the game.");
	}
}
