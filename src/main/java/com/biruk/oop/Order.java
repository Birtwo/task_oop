package com.biruk.oop;

public class Order {
  private int weight;
  private Dock start;
  private Dock finish;
  private int price;

  public Order(int weight, Dock start, Dock finish, int price) {
    this.weight = weight;
    this.start = start;
    this.finish = finish;
    this.price = price;

  }

  public int getWeight() {
    return weight;
  }

  public Dock getStart() {
    return start;
  }

  public Dock getFinish() {
    return finish;
  }

  public int getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Order{" +
        "weight=" + weight +
        ", start=" + start +
        ", finish=" + finish +
        '}';
  }
}
