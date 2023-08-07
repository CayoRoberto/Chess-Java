package boardgame;

public class Board {
 
	private int rows;
	private int columns;
	private Piece[][] pieces;
	public Board(int rows, int columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	public int getLinhas() {
		return rows;
	}
	public void setLinhas(int linhas) {
		this.rows = rows;
	}
	public int getColunas() {
		return columns;
	}
	public void setColunas(int columns) {
		this.columns = columns;
	}
	
	
}
