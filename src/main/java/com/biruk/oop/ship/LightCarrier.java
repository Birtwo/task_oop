package com.biruk.oop.ship;

import com.biruk.oop.Utilities;

public class LightCarrier extends Ship {

  public LightCarrier() {
    super.price = 1500;
    super.name = "Flash"+ Utilities.generateRandomNumberOf(13,1747);
    super.maxAmountOffers = 3;
    super.countTime();
  }
}
