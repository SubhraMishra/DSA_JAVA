package TicTacToe;

public class Players {

    private String name;
    private char symbol;

    public Players(String name,char symbol){
        setName(name);
        setSymbol(symbol);


    }

    private void setName(String name) {
        if(!name.isEmpty()){
            this.name=name;
        }
    }
    String getName(){
        return this.name;
    }
    void setSymbol(char symbol) {
        if(symbol!='\0'){
            this.symbol=symbol;
        }
    }
    char getSymbol(){
        return this.symbol;
    }
}
