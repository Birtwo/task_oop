package com.biruk.oop.ship;

import java.util.ArrayList;
import java.util.List;

public abstract class Ship {

  public static final int SPEED = 5;

  protected String name;
  protected int loadCapacity;
  protected int price;
  protected int maxAmountOffers;
  private int time;
  private int amountOffers;

  public static List<Ship> shipList = new ArrayList<>();

  // TODO цікава ідея - оффери даного корабля генеруються рандомно і заноситься ліст

  protected void countTime() {
    setDifferentOffers();
    time = SPEED * amountOffers;
  }

  protected void setDifferentOffers() {
    amountOffers = 1 + (int)  (Math.random() * maxAmountOffers);
  }

  public int getTime() {
    return time;
  }

  public int getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  public int getLoadCapacity() {
    return loadCapacity;
  }
}
