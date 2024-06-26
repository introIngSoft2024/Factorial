package org.iis2024.factorial ;

public class Factorial {

  public long compute(long value) {
    long result ;
    if (value < 0) {
      throw new RuntimeException("The value " + value + " is negative");
    }
    if (value == 0) {
      result = 1 ;
    } else {
      result = value * compute(value - 1) ;
    }
    return result ;
  }

  public static void main(String[] args) {
    Factorial factorial = new Factorial();
    long result = factorial.compute(20) ;
    System.out.println("The factorial of 20 is " + result);
  }

  public void f() {}
}
