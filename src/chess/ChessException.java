package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessException extends RuntimeException {
    public static final long serialVersionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }
}
