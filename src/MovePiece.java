public class MovePiece {
    public int currRow, currCol, prevRow, prevCol;

    public MovePiece(int moveRow, int moveCol){
        this.prevRow = this.currRow;
        this.prevCol = this.currCol;
        this.currRow = moveRow;
        this.currCol = moveCol;

    }
}
