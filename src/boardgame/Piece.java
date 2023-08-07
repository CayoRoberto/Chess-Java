package boardgame;

public class Piece {

	protected Position position;
	private Piece piece;
	
	public Piece(Piece piece) {
		super();
		this.piece = piece;
		position = null;
	}

	protected Position getPosition() {
		return position;
	}

	
	
}
