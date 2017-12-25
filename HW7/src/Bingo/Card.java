package Bingo;

public class Card {
	
	private bin[][] c=new bin[3][5];
	
	// khone haye card va adad hamono neshon mide
	public bin[][] getc(){
		return c;
	}
	
	// satr va soton card ro midim adade dakhele ono mide
	public int getNumber(int row,int column){
		return  c[row][column].getNumber();
	}

}
