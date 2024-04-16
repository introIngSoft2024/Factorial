package org.iis2024.factorial ;

public class Factorial {

  public long compute(long value) {
    long result ;
    if (value == 0) {
      result = 1 ;
    } else {
      result = value * compute(value - 1) ;
    }
    return result ;
  }
}
