package chess;

import boardgame.Board;

public class ChessMatch {
	
	Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	public ChessPiece[][] getPieces() {
		
		ChessPiece[][] mat = new ChessPiece[board.getRow()][board.getColunm()];
		
		for(int i=0;i<board.getRow();i++) {
			for(int j=0;j<board.getColunm();j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		
		return mat;
	}

}
