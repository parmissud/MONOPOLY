package MONOPOLY;

public abstract class Property extends Square{
    private String name;
    private int price;
    private int rent;
    protected Player owner;
    public boolean mortgaged;

    public Property(String name, int price, int rent){
        this.name = name;
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

    public void setOwner(Player newOwner){
        owner = newOwner;
    }

    public void bought(Player currentPlayer){
        owner = currentPlayer;
        currentPlayer.buy(this);
    }

    // offerBuy & doAction miss
}
