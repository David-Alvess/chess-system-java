package chess;

import boardgame.Board;
import boardgame.BoardExcepetion;
import boardgame.Piece;

public class ChessException extends BoardExcepetion {
    public static final long serialVersionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }
}
