package MONOPOLY;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    private String name;
    public boolean inJail = false;
    private int position;
    private int money = 1500;
    //private Property[] properties;

    public Player(String name){
        this.name = name;
        position = 0;
    }

    public int getPosition() { return position; }

    public String getName() { return name; }

    public int getMoney() { return money; }

//  public Property[] getProperties(Player player){}

    public int Dice(){
        Scanner input = new Scanner(System.in);
        int diceNum = input.nextInt();
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
}
