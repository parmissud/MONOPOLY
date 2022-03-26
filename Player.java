package MONOPOLY;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    private String name;
    public boolean inJail = false;
    public boolean invested = false;
    public int lendedMoney = 0;
    private int position;
    protected int money = 1500;
    //private ArrayList<Property> properties = new ArrayList<Property>();

    public Player(String name){
        this.name = name;
        position = 0;
    }

    public int getPosition() { return position; }
    public void setPosition(int position){
        this.position = position;
    }

    public String getName() { return name; }

    public int getMoney() { return money; }

//  public ArrayList<Property> getProperties(Player player){}

    public int Dice(){

        Scanner input = new Scanner(System.in);
        int diceNum = input.nextInt();
        while (diceNum > 6 || diceNum < 1) {
            System.out.println("invalid input. (1 to 6)");
            diceNum = input.nextInt();
        }
        return diceNum;
    }

    public void addMoney(int addMoney){
        this.money += addMoney;
    }

    public void pay(Player receiving, int amount){
        receiving.addMoney(amount);
        addMoney(-amount);
    }

    public void move(int numSquares, Board board){
        position += numSquares;
        if(position >= 24){
            position %= 24;
        }
    }

    public void moveTo(int position){
        this.position = position;
    }

    public void buy(Property property){

    }

    public void sell(Property property){

    }
    public void mortgage(Property property){
        //to get mortgage
    }

    public void payMortgage(Property property){
        //to pay mortgage
    }

    public boolean owns(Property property){

    }

    public int getNumCinemas(){}
    public int getNumFields(){}
    public int getNumHouses(){}
    public int getNumHotels(){}
    public ColorProperty[] getHouseableProperties(){}
    public static void main(String[] args){
        Player p = new Player("Ali");
        p.Dice();
    }
}
