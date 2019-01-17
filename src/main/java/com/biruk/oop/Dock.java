package com.biruk.oop;

import java.util.ArrayList;
import java.util.List;

public class Dock {
  private int id;
  private String name;
  public static List<Dock> dockList = new ArrayList<>();

  public Dock(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public static Dock chooseDock(){
    System.out.println("Choose dock:");
    int chosenId = Utilities.getChoiceFromConsole();
    for (Dock dock : dockList) {
        if(chosenId == dock.id){
          return dock;
        }
    }
    //TODO wrong id input
    return null;
  }
  public static void showDockList(){
    dockList.forEach(
        dock -> {
          System.out.println(dock.id+" "+dock.name);
        });
  }

  @Override
  public String toString() {
    return "Dock{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
