public class Piece {
    Player player;
    TileLocation tile;
    int direction;
    boolean king = false;
    public Piece(Player player, TileLocation tile, int direction){
        this.player = player;
        this.tile = tile;
        this.direction = direction;
    }
    public boolean capture(Piece other){
        if(this.player == other.player){
            return false;
        }
        return true;
    }
    public boolean moveToTile(TileLocation tile){
        if(king){
            return true;
        }
        else {

        }
        return false;
    }
    public Player getPlayer(){
        return this.player;
    }
    public boolean isKing(){
        return this.king;
    }
    public void setKing (){
        this.king = true;
    }
}
