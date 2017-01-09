package intro;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ProductTest {

  private Product sixTimesSeven;
  
  @Before
  public void setUp() {
    sixTimesSeven = new Product(new WholeNumber(6), new WholeNumber(7));
  }
  
  @Test
  public void testSumIsEvaluated() {
    assertEquals(42, sixTimesSeven.evaluate());
  }

}
