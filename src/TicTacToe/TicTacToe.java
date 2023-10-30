package TicTacToe;
import java.util.Scanner;
public class TicTacToe {


    private Players Player1,Player2;
    private Board board;
    private int numPlayers;

    public static void main(String[] args) {
        TicTacToe t=new TicTacToe();
        t.startgame();
    }

    public void startgame() {
        //take players name
        Scanner s=new Scanner(System.in);
        Player1=takePlayerInput(++numPlayers);
        Player2=takePlayerInput(++numPlayers);
        int status = Board.INCOMPLETE;
        while(Player1.getSymbol()==Player2.getSymbol()) {
            System.out.println("Symbol already taken!! please enter the symbol again");
            Player2.setSymbol(s.next().charAt(0));
        }

            //create the board
            board = new Board(Player1.getSymbol(), Player2.getSymbol());

            //Play the game
            boolean Player1turn = true;

            while (status == Board.INCOMPLETE || status == Board.INVALID) {
                if (Player1turn) {
                    System.out.println("Player 1- " + Player1.getName() + "'s turn");
                    System.out.println("Enter x: ");
                    int x = s.nextInt();
                    System.out.println("Enter y: ");
                    int y = s.nextInt();

                    status = board.move(Player1.getSymbol(), x, y);
                    if (status == Board.INVALID) {
                        System.out.println("Your move is invalid!! Please try again");
                        continue;
                    }

                } else {
                    System.out.println("Player 2- " + Player2.getName() + "'s turn");
                    System.out.println("Enter x: ");
                    int x = s.nextInt();
                    System.out.println("Enter y: ");
                    int y = s.nextInt();

                    status = board.move(Player2.getSymbol(), x, y);
                    if (status == Board.INVALID) {
                        System.out.println("Your move is invalid!! Please try again");
                        continue;
                    }
                }
                Player1turn = !Player1turn;
                Board.print();
            }
            if (status == Board.PLAYER1WINS)
                System.out.println("Player 1 "+Player1.getName()+" WINS");
            else if (status == Board.PLAYER2WINS)
                System.out.println("Player 2 "+Player2.getName()+" WINS");
            else System.out.print("Draw!!");

        }


    private Players takePlayerInput(int num) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter player "+num+"name : ");
        String name=s.nextLine();
        System.out.println("Enter player "+num+"symbol : ");
        char symbol=s.next().charAt(0);
        Players p=new Players(name,symbol);
        return p;
    }
}
