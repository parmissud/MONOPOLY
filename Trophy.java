package MONOPOLY;
public class Trophy extends Square{

    public Trophy(String name, Player currentPlayer) {
        super(name);
        currentPlayer.money += 200;
    }
}
