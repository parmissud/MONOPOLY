package MONOPOLY;
public class Jail extends Square {

    public Jail(String name, Player currentPlayer){
        super(name);
        currentPlayer.inJail = true;
    }

}
