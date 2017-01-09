package intro;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SumTest {

  private Sum twoPlusFive;
  
  @Before
  public void setUp() {
    twoPlusFive = new Sum(new WholeNumber(2), new WholeNumber(5));
  }
  
  @Test
  public void testSumIsEvaluated() {
    assertEquals(7, twoPlusFive.evaluate());
  }

//  @Test
//  public void testEqualityOfNumbers() {
//    assert(zero.equals(new WholeNumber(0)));
//  }
//
//  @Test
//  public void testNumberNotEqualToNull() {
//    assert(!zero.equals(null));
//  }
//
//  @Test
//  public void testStringFormOfNumber() {
//    assertEquals("0", zero.toString());
//  }
}
