package intro;

/**
 * This class represents a whole number
 */
public class WholeNumber extends AbstractExpression {
  
  private int value;

  public WholeNumber(int val) {
    value = val;
  }

  public String toString() {
    return String.valueOf(value);
  }

  public int evaluate() {
    return this.value;
  }

}
