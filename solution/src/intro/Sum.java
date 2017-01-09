package intro;

public class Sum extends BinaryExpression {

  public Sum(Expression l, Expression r) {
    super(l,r);
  }

  public int evaluate() {
    return left.evaluate() + right.evaluate(); 
  }
}
