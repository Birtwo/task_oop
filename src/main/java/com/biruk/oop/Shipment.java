package com.biruk.oop;

import com.biruk.oop.ship.Ship;
import java.util.List;

public class Shipment {

  private Order currentOrder;

  public Order createOrder() {
    System.out.println("Please enter the weight of your shipment:");
    int weight = Utilities.getChoiceFromConsole();
    Dock.showDockList();
    System.out.println("Enter your max price range");
    int price = Utilities.getChoiceFromConsole();
    System.out.println("Enter the starting dock:");
    Dock startDock = Dock.chooseDock();
    System.out.println("Enter the ending dock:");
    Dock finalDock = Dock.chooseDock();

    currentOrder = new Order(weight, startDock, finalDock, price);
    return currentOrder;
  }

  public Order getCurrentOrder() {
    if (currentOrder == null) {
      System.out.println("You have not created an order");
      createOrder();
    }

    return currentOrder;
  }

  public void formOffers() {
    List<Ship> shipList = Ship.shipList;
    for (int i = 0; i < shipList.size(); i++) {
      Ship currentShip = shipList.get(i);
      if (Offer.sortBy(currentOrder.getPrice(), currentOrder.getWeight(), currentShip)) {
        new Offer(currentShip,i).printOffer();
      };
    }
  }
}
