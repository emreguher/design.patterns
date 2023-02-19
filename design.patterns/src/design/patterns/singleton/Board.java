package design.patterns.singleton;

public class Board {
	
	private static final Board BOARD = new Board();
	
	private Board() {
		// TODO Auto-generated constructor stub
	}
	
	public static Board getBoard() {
		return BOARD;
	}
	
	private String[] state = {"1","2","3","4","5","6","7","8","9"};
	
	public void setCharacter(String selectedNumber, String character) {
		
		int index = Integer.valueOf(selectedNumber) - 1;
		state[index] = character;
	}
	
	public void showBoard() {
		
		System.out.println(state[0] + "|" + state[1] + "|" + state[2]);
		System.out.println("---------");
		System.out.println(state[3] + "|" + state[4] + "|" + state[5]);
		System.out.println("---------");
		System.out.println(state[6] + "|" + state[7] + "|" + state[8]);
		System.out.println("---------");
	}

}
