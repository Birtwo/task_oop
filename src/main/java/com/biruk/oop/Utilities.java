package com.biruk.oop;

import com.biruk.oop.ship.FalconCarrier;
import com.biruk.oop.ship.HeavyCarrier;
import com.biruk.oop.ship.LightCarrier;
import com.biruk.oop.ship.Ship;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilities {

  public static int getChoiceFromConsole() {
    int i = 0;
    try {
      i = new Scanner(System.in).nextInt();
    } catch (InputMismatchException e) {
      System.out.println("The data is incorrect, please try again\n");
      i = getChoiceFromConsole();
    }
    return i;
  }

  public static void generateData() {
    generateDocks();
    generateShip();
  }

  private static void generateDocks() {
    Dock.dockList.add(new Dock(1, "kek"));
    Dock.dockList.add(new Dock(2, "school"));
    Dock.dockList.add(new Dock(3, "was"));
    Dock.dockList.add(new Dock(4, "very"));
    Dock.dockList.add(new Dock(5, "hard"));
    Dock.dockList.add(new Dock(6, "lol"));
    Dock.dockList.add(new Dock(7, "kiki"));
    Dock.dockList.add(new Dock(8, "do"));
    Dock.dockList.add(new Dock(9, "you"));
    Dock.dockList.add(new Dock(10, "love"));
  }

  private static void generateShip() {
    Ship.shipList.add(new FalconCarrier());
    Ship.shipList.add(new LightCarrier());
    Ship.shipList.add(new LightCarrier());
    Ship.shipList.add(new LightCarrier());
    Ship.shipList.add(new HeavyCarrier());
    Ship.shipList.add(new HeavyCarrier());
    Ship.shipList.add(new HeavyCarrier());
  }
  public static int generateRandomNumberOf(int start, int finish){
    return start+ (int) (Math.random() * finish);
  }
}
