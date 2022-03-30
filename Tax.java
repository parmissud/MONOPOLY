package MONOPOLY;

public class Tax extends Square{

    public Tax(String name, Player currentPlayer){
        super(name);
        currentPlayer.money -= (currentPlayer.money/10);
    }

}
