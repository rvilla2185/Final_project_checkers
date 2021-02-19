public class TileLocation {
    int row;
    int col;
    Piece piece;
    boolean inUse = false;

    public TileLocation(int row, int col){
        this.row = row;
        this.col = col;
    }
    public Piece getInUse(){
        if (inUse){
            return piece;
        }
        return null;
    }
    public void setInUse(Piece newPiece){
        new TileLocation(newPiece.tile.row, newPiece.tile.col);
        inUse = true;
    }
    private boolean isInUse(){
        return piece != null;
    }

}
