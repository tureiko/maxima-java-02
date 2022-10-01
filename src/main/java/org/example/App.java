package org.example;

public class App {
 public static void main(String[] args) {
 // Transport transport=new Transport("furgon",500,90,3.2f);
  City piter=new City("piter",100,true,true);
  Ship tanker=new Ship("tanker",20000,50,50.5f);

  System.out.println(tanker.getPrice(piter));


 }

}