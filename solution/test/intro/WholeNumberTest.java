package intro;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WholeNumberTest {

  private WholeNumber zero = new WholeNumber(0);

  @Test
  public void testNumberIsEvaluated() {
    assertEquals(0, zero.evaluate());
  }

  @Test
  public void testEqualityOfNumbers() {
    assert(zero.equals(new WholeNumber(0)));
  }

  @Test
  public void testNumberNotEqualToNull() {
    assert(!zero.equals(null));
  }

  @Test
  public void testStringFormOfNumber() {
    assertEquals("0", zero.toString());
  }
}
