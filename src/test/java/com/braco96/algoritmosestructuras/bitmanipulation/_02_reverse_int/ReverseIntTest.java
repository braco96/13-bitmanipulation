package com.braco96.algoritmosestructuras.bitmanipulation._02_reverse_int;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.braco96.algoritmosestructuras.bitmanipulation._02_reverse_int.ReverseInt;

public class ReverseIntTest {

  @Test
  public void reverseIntTest() {
    ReverseInt r = new ReverseInt();

    assertEquals(964176192, r.reverseBits(43261596));
    assertEquals(-536870913, r.reverseBits(-5));
  }
}
