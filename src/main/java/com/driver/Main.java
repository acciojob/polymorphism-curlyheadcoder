package com.driver;
class Product{
  public int product(int x, int y){
    return x*y;
  }
  public int product(int x, int y, int z){
    return x*y*z;
  }
  public double product(double x, double y){
    return x*y;
  }
}
public class Main {
  public static void main(String [] args){
    Product p = new Product();
    int res1 = p.product(5,10);
    System.out.println(res1);
    int res2 = p.product(2,3,4);
    System.out.println(res2);
    double res3 = p.product(5.0, 10.0);
    System.out.println(res3);
  }
}
