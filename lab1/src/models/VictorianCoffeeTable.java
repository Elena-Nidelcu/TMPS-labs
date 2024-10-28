package models;

import abstractfactory.ICoffeeTable;

public class VictorianCoffeeTable implements ICoffeeTable {
    public void displayStyle() { System.out.println("Victorian CoffeeTable."); }
}