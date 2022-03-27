package MONOPOLY;
public class Jail extends Square {


    public void sendToJail(Player jailedPlayer){
        jailedPlayer.inJail = true;
        System.out.println("You are now in Jail for the next 5 turns");
        // if diceNumber == 1 --> free
    }
    public boolean jailTurn(Player currentPlayer) { //returns true if player escaped jail on turn
        currentPlayer.turnsInJail++;
        System.out.print("Turn " + currentPlayer.turnsInJail);

        if (currentPlayer.turnsInJail == 5) {
            currentPlayer.inJail = false;
        }
    }

}
