package org.example;

public class App {
 public static void main(String[] args) {

  City Spb=new City("piter",200,true,true);
  City Murmansk = new City("Мурманск",1400,false, true);
  City Tver = new City("Тверь", 540, false, true);
  City Mosсow = new City("Москва", 800, true, true);

  Ship tanker=new Ship("tanker",20000,50,70.5f);
  Plane vert=new Plane("vert",2000,200,60.5f);
  Truck fura=new Truck("fura",10000,100,50.3f);
  Ship kater=new Ship("kater",400,90,45.5f);

  Logistics  logistics = new Logistics(tanker, fura, kater, vert);

  try{ logistics.getShipping(Mosсow,2900,9);}
  catch (Exception ex) {
   System.out.println("Нет нужного транспорта");
  }

  TransportFactory factory = new TransportFactory();
  Transport transport = factory.getTransport(Spb,190700,4);




 }



}