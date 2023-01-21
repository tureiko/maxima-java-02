package org.example;

public class App {
 public static void main(String[] args) throws Exception{

  City Spb = new City("Санкт-Петербург", 120, true, true);
  City Murmansk = new City("Мурманск",1400,false, true);
  City Tver = new City("Тверь", 540, false, true);
  City myCity = new City("Город",540);
  City Mosсow = new City("Москва", 800, true, true);

  Truck trailer_truck = new Truck("Грузовик с полуприцепом", 44000, 120, 150.41 );
  Ship tanker = new Ship("Танкер",18159000, 27, 300.82);
  Plane aircraft = new Plane("Самолёт",120000, 800, 600.68);
  Ship kater = new Ship("Катер",1815, 90, 100.82);

  Logistics  logistics = new Logistics(tanker, trailer_truck, kater, aircraft,trailer_truck);
  logistics.getShipping(Mosсow,45000,30);

  /*TransportFactory factory = new TransportFactory();
  Transport transport = factory.getTransport(Spb,190700,4);*/




 }



}