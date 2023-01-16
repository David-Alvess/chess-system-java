package chess;

import boardgame.BoardExcepetion;

public class ChessException extends BoardExcepetion {
    public static final long serialVersionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }
}
