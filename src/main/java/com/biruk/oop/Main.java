package com.biruk.oop;

/**
 * Морські перевезення вантажів.
 * Сформувати пропозиції перевезення товарів з вказаного порту-відправника
 * у порт призначення залежно від тоннажу товару.
 * Реалізувати можливість вказати клієнту максимальну ціну оплати,
 * пошук найшвидших або найдешевших пропозицій.
 *
 *
 * Фільтр пропозицій повязаний з ціною встановленою користувачем
 */
public class Main {
  public static void main(String[] args) {
    Utilities.generateData();
    System.out.println("Welcome");

    Shipment shipment = new Shipment();
    System.out.println(shipment.createOrder());
    shipment.formOffers();
  }
}
