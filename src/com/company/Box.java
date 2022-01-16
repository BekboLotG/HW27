package com.company;

public class Box<T> {

  public static <T> Box boxMethod(Box <T>box){

      System.out.println("boxMethod()");
//      return box;
      return new Box<T>();

     }



    @Override
     public String toString() {
         return "Box";
     }


}
