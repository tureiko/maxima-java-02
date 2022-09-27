package org.example;

public class App {
 public static void main(String[] args) {
  Transport transport=new Transport("furgon",500,90,3.2f);
  City piter=new City("piter",100);
  System.out.println(transport.getPrice(piter));

 }

}