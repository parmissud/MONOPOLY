package MONOPOLY;

import java.util.ArrayList;
import java.util.Scanner;


public class Player {

    private String name;
    public boolean inJail = false;
    public boolean invested = false;
    public int lendedMoney = 0;
    public int turnsInJail = 0;
    private int index;
    protected int money = 1500;
    public ArrayList<Property> properties = new ArrayList<Property>();

    public Player(String name){
        this.name = name;
        index = 0;
    }

    public int index() { return index; }

    public void setPosition(int position){
        this.index = position;
    }

    public String getName() { return name; }

    public int getMoney() { return money; }


    public void addMoney(int addMoney){
        this.money += addMoney;
    }

    public void pay(Player receiving, int amount){
        receiving.addMoney(amount);
        addMoney(-amount);
    }


    public void moveTo(int position){
        if(position >= 24)
            position %= 24;

        this.index = position;

    }

    public void buy(Property property){
        if(!property.mortgaged) {

            addMoney(-property.getPrice());
            properties.add(property);
            property.setOwner(this);
            //sortPropertiesByGroup(properties);
            property.mortgaged = true;
        }
        else
            System.out.println("This property is mortgaged.");
    }

    public void sell(Property property){
        properties.remove(property);
        property.mortgaged = false;
        addMoney(property.getPrice() / 2);
        property.setOwner(null);
    }
    public void sell2 (int position){

    }

    public void free(){
        inJail = false;
        money -= 50;
        turnsInJail = 0;
    }


    public void fly(int position) {
        this.moveTo(position);
        this.setPosition(position);
    }

    public boolean owns(Property property){

        if(property.owner.equals(this))
            return true ;
        else
            return false;
    }


    public int getNumCinemas(){
        int numCinemas = 0;
        for(Property p : properties){
            if(p instanceof Cinema){
                numCinemas++;
            }
        }
        return numCinemas;
    }

    public int getNumFields(){
        int numFields = 0;
        for(Property p : properties){
            if(p instanceof Fields){
                numFields++;
            }
        }
        return numFields;
    }

    public void Property(){
        System.out.println("Your properties:");
        System.out.println(this.properties);
        System.out.println("Your money: " + money + "$");
    }

    //public ArrayList<Property> getHouseableProperties(){}

}
