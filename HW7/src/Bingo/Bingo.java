package Bingo;

public class Bingo {
	
	Player [] players;
	
	
	public String play(int number){
		String winner="";
		for(int i=0;i<players.length;i++){
			players[i].markNumber(number);
			if(players[i].isWinner())
				winner=winner+players[i].getName()+" ";
			
		}

		return winner;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
