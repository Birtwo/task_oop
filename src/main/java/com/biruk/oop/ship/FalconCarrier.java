package com.biruk.oop.ship;

import com.biruk.oop.Utilities;

public class FalconCarrier extends Ship {

  public FalconCarrier() {
    super.price = 7500;
    super.name = "Tesla"+ Utilities.generateRandomNumberOf(1,17457);
    super.maxAmountOffers = 1;
    super.countTime();
  }
}
