package Bingo;

public class Player {
	private String name;
	private Card[] cards;
	
	//constructor
	public Player(String name,Card[] a){
		this.name=name;
		cards=a;
	}
	
	
	// return name of the player
	public String getName(){
		return name;
	}
	// return the cards that player have
	public Card[] getCards(){
		return cards;
	}
	
	
	// check mikone player barande shode ya na
	public boolean isWinner(){
		for(int i=0;i<cards.length;i++){
			bin[][] c=cards[i].getc();
			for(int j=0;j<3;j++){
				int f=0;
				for(int k=0;k<5;k++){
					if(c[i][j].getMark()==true)
						f++;
				}
				if(f==5)
					return true;
			}
		}
		return false;
	}
	
	// adade dade shode ro dar card haye player mark mikone
	public void markNumber(int number){
		for(int i=0;i<cards.length;i++){
			bin[][] c=cards[i].getc();
			for(int j=0;j<3;j++){
				for(int k=0;k<5;k++){
					if(c[i][j].getNumber()==number)
						c[i][j].setMark(true);
				}
			}
		}
		
	}
}
