package Bingo;


// class baraye rahati va tasrih dar farayande mark kardan bevojod omade
public class bin {
	
	private int number=(int) (Math.random()*90+1);
	private boolean Mark=false;
	
	
	// adad dakhele khane ra neshon mide
	public int getNumber() {
		return number;
	}
	
	
	// adad ra mark mikonad
	public void setMark(boolean mark) {
		Mark = mark;
	}
	//neshon mide ke adad mark shode ya na
	public boolean getMark(){
		return Mark;
	}

}
