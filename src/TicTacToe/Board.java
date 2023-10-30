package TicTacToe;

public class Board {
    private static char[][] board;
    private static int boardsize=3;
    private char p1Symbol,p2Symbol;
    //count of number of cells that are filled
    public int count;
    private static final char EMPTY=' ';
    public static final int PLAYER1WINS=1;
    public static final int PLAYER2WINS=2;
    public static final int DRAW=3;
    public static final int INCOMPLETE=4;
    public static final int INVALID=5;

    public Board(char p1Symbol,char p2Symbol){
        board=new char[boardsize][boardsize];
        for(int i=0;i<boardsize;i++){
            for(int j=0;j<boardsize;j++){
                board[i][j]=EMPTY;
            }
        }
        this.p1Symbol=p1Symbol;
        this.p2Symbol=p2Symbol;

    }
    public int move(char symbol,int x,int y){
        if(x<0 || x>=boardsize || y<0 || y>=boardsize || board[x][y]!=EMPTY)
            return INVALID;

        board[x][y]=symbol;
        count++;

        //row
        if(board[x][0]==board[x][1] && board[x][0]==board[x][2]){
            return symbol==p1Symbol?PLAYER1WINS:PLAYER2WINS;
        }
        //column
        if(board[0][y]==board[1][y] && board[0][y]==board[2][y]){
            return symbol==p1Symbol?PLAYER1WINS:PLAYER2WINS;
        }
        //diagonal
        if(board[0][0]!=EMPTY && board[0][0]==board[1][1] && board[0][0]==board[2][2]){
            return symbol==p1Symbol?PLAYER1WINS:PLAYER2WINS;
        }
        if(board[0][2]!=EMPTY && board[0][2]==board[1][1] && board[0][2]==board[2][0]){
            return symbol==p1Symbol?PLAYER1WINS:PLAYER2WINS;
        }
        if(count==boardsize*boardsize)
            return DRAW;
        return INCOMPLETE;
        }


    public static void print()
    {
        System.out.println("_______________");
        for(int i=0;i<boardsize;i++){
            for(int j=0;j<boardsize;j++){
                System.out.print("| "+board[i][j]+" |");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("_______________");
    }
}
