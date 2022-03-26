package MONOPOLY;
public class Railroad extends Square {

    public Railroad(String name , Player currentPlayer){
        super(name);
        currentPlayer.money -= 100;
    }

}
