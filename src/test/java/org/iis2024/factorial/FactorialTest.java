package org.iis2024.factorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 Factorial:
 0 - 1
 1 - 1
 2 - 2
 3 - 6
 4 - 24
 7 - 5040
 -1 - raise an exception
 */
class FactorialTest {

  private Factorial factorial;

  @BeforeEach
  void setUp() {
    factorial = new Factorial();
  }

  @Test
  void shouldFactorialOf0Returns1() {
    long obtainedValue = factorial.compute(0);
    long expectedValue = 1;

    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  void shouldFactorialOf1Returns1() {
    long obtainedValue = factorial.compute(1);
    long expectedValue = 1;

    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  void shouldFactorialOf2Returns2() {
    // Act
    long obtainedValue = factorial.compute(2);
    long expectedValue = 2;

    // Assert
    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  void shouldFactorialOf3Returns6() {
    // Act
    long obtainedValue = factorial.compute(3);
    long expectedValue = 6;

    // Assert
    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  void shouldFactorialOf4Returns24() {

    // Act
    long obtainedValue = factorial.compute(4);
    long expectedValue = 24;

    // Assert
    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  void shouldFactorialOf7Returns5040() {
    // Act
    long obtainedValue = factorial.compute(7);
    long expectedValue = 5040;

    // Assert
    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  void shouldFactorialOfANegativeNumberThrowAnException() {
    assertThrows(RuntimeException.class, () -> factorial.compute(-4));
  }
}