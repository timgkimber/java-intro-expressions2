package intro;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExpsTestRunner {
  public static void main(String[] args) {
    System.out.print("\nRunning tests ... ");
    
    Result result = JUnitCore.runClasses(
        WholeNumberTest.class
        , SumTest.class
        , ProductTest.class
    );

    System.out.printf("%d failed tests\n", result.getFailures().size());
    
    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }
  }
} 
