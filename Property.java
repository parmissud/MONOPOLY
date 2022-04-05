package MONOPOLY;

public class Property extends Square{
    private String name;
    private int price;
    private int rent;
    protected Player owner;
    public boolean mortgaged;

    public Property(int index, int price, int rent){
        super(index);
        this.price = price;
        this.rent = rent;
    }

    public int getPrice(){
        return price;
    }

    public int getRent(){
        return rent;
    }

    public Player getOwner() {
        return owner;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public void setOwner(Player newOwner){
        owner = newOwner;
    }

    public void bought(Player currentPlayer){
        owner = currentPlayer;
        currentPlayer.addMoney(-1*price);
        currentPlayer.buy(this);
    }

    //offerBuy & doAction miss
}
