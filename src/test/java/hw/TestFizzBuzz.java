 package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFizzBuzz {

  private FizzBuzz fixture;

  @Before
  public void setUp() throws Exception {
    fixture = new FizzBuzz();
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }

  @Test
  public void testNegativeTen(){
    assertNull(fixture.fizzBuzz(-10));
  }
  @Test
  public void testNegativeOne(){
    assertNull(fixture.fizzBuzz(-1));
  }
  @Test
  public void testZero() {
    assertNull(fixture.fizzBuzz(0));
  }
  @Test
  public void testOne() {
    String[] expected={"1"};
    assertArrayEquals(expected, fixture.fizzBuzz(1));
  }
  @Test
  public void testSeven() {
    String[] expected={"1","2","Fizz","4","Buzz","Fizz","7"};
    assertArrayEquals(expected, fixture.fizzBuzz(7));
  }
  @Test
  public void testSeventeen() {
    String[] expected={"1","2","Fizz","4","Buzz","Fizz","7","8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17"};
    assertArrayEquals(expected, fixture.fizzBuzz(17));

  }

}

