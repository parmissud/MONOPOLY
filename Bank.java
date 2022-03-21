package MONOPOLY;

public class Bank extends Square{
    private int lendedMoney = 0;
    public Bank(String name, Player currentPlayer){
        super(name);
    }

    public void Offer(){
        System.out.println("Yes or No?");
        //if Yes --> investment
    }

    public void investment(Player currentPlayer){
        lendedMoney = currentPlayer.money / 2;
        currentPlayer.money -= (currentPlayer.money /2);
    }

    public void getBonus(Player currentPlayer){
        //if investment done --> currentPlaye.money += lendedMoney*2
        //if Not --> pass
    }
}
