package MONOPOLY;

import java.util.Scanner;

public class Airport extends Property{

    public Airport(String name, int price, int rent){
        super(name , price , rent);
    }

    public void fly(Player currentPlayer, int position) {
        currentPlayer.moveTo(position);
    }

    public void OfferBuyTicket(){
        System.out.println("Would you want to buy ticket?");
        //if yes --> buyTicket
    }

    public void buyTicket(Player currentPlayer){
        currentPlayer.money -= 50;
        System.out.println("Ticket Bought. Choose destination:");
        Scanner input = new Scanner(System.in);
        int destination = input.nextInt();
        fly(currentPlayer,destination);
    }
}
