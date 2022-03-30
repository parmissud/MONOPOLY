package MONOPOLY;
public class Cinema extends Property {
    public Cinema(String name, int price , int rent) {
        super(name, 200, 25);
    }

    //when owner buys a new cinema ( more than one ) this method should be called
    public void increaseRent() {
        setRent(getRent()*2);
    }

    public void buyTicket(Player currentPlayer){
        currentPlayer.money -= getRent();
        System.out.println("Ticket Bought. Enjoy!");
    }
}
