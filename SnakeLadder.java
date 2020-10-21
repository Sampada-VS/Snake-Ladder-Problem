public class SnakeLadder {
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	
	public static void main(String[] args) {
		int playerPosition = 0;
		while (playerPosition < 100) {
			
			int diceNum = ((int)((Math.random()*10)%6))+1;
			int playOption = (int)((Math.random()*10)%3);
			
			switch (playOption) {
				case NO_PLAY :	
					break;
				case LADDER :
					playerPosition = playerPosition + diceNum;
					break;
				case SNAKE :
					playerPosition = playerPosition - diceNum;
					break;
			}
			if (playerPosition < 0)
				playerPosition = 0;
			if (playerPosition > 100)
				playerPosition = playerPosition - diceNum;
		}
		System.out.println("Player wins with position :"+playerPosition);
	}
}