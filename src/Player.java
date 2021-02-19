import java.awt.*;
import java.util.ArrayList;

public abstract class Player {
    public Player(){
    }
    public abstract Piece addPiece(TileLocation start);
    public abstract TileLocation executeMove(MovePiece move);
    public abstract Checkers getGame();
    public abstract Checkers setGame(Checkers game);
    public abstract ArrayList<Piece> getPieces();
    public abstract int getNumPieces();
    public abstract void removePiece(Piece remove);
    public abstract void setColor(Color color);
    public abstract void setDirection(int direction);
    public abstract MovePiece chooseMove (MovePiece move);
    public abstract boolean king (Piece piece);

}
