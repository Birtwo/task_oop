package com.biruk.oop.ship;

import com.biruk.oop.Utilities;

public class HeavyCarrier extends Ship {

  public HeavyCarrier() {
    super.price = 750;
    super.name = "Turtle" + Utilities.generateRandomNumberOf(1,17457);
    super.maxAmountOffers = 8;
    super.countTime();
  }
}
