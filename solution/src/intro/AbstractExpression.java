package intro;

public abstract class AbstractExpression 
implements Expression {

  public int compareTo(Expression that) {
    return this.evaluate() - that.evaluate();
  }
  
  public boolean equals(Object obj) {
    if (obj == null)                    { return false; }
    if (! (obj instanceof Expression)) { return false; }

    Expression that = (Expression) obj;
    return this.evaluate() == that.evaluate();
  }

}
