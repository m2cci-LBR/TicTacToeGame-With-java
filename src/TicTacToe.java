public class TicTacToe {

    public enum Cell { E,X,O };

    private Cell [][] board;

    public TicTacToe() {
        board = new Cell[3][3];
        for (int i=0;i< board.length;i++){
            for (int j=0;j< board[i].length;j++){
                board[i][j] = Cell.E;
            }
        }
    }

    public String toString(){
        String result ="";
        for (Cell [] row: board) {
            for (Cell c: row) {
                if (c == Cell.E)
                   result += "_";
                else
                    result +=c;
            }
            result+="\n";
        }
        return result;
    }
  public void setCell(int row , int col , Cell value){
      board[row][col]=value;
    }

    public static void main(String[] args) {
      TicTacToe b = new TicTacToe();
      // TO DO add scanner to read player game choices
      b.setCell(1,1,Cell.X);
      System.out.println(b);
    }
}
