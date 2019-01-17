package com.biruk.oop;

import com.biruk.oop.ship.Ship;
import java.util.ArrayList;
import java.util.List;

public class Offer {
  private int id;
  private int time;
  private int price;
  private String shipName;
  private static List<Offer> offersList = new ArrayList<>();

  public Offer(Ship currentShip, int id) {
    this.id = id;
    this.time = currentShip.getTime();
    this.price = currentShip.getPrice();
    this.shipName = currentShip.getName();

    offersList.add(this);
  }

  public void printOffer() {
    System.out.println("[" + id + "] - " + shipName + " - " + time + " days - " + price + "$");
  }

  public static boolean sortBy(int price, int weight, Ship currentShip) {
    return currentShip.getPrice() <= price && currentShip.getLoadCapacity() <= weight;
  }
}
