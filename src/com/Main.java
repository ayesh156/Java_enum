package com;

class Main {

//    final enum A{
//        X,Y,Z
//    }
    
    enum A{
        X,Y,Z
    }
 
  public static void main(String[] args) {
    Size size = Size.XXL;
    
    int  i = size.compareTo(Size.XXL);
      System.out.println(i);
//      System.out.println(X.E.A);
  }
  
}