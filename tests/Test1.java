/* 
 * JUnit5 test class
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Test1 
{
   @Test
   public void testEvaluate() 
   {
	   int a = 10;
      int b = 20;
      
      int sum = Test.BigBrainAdd(a,b);
	   assertEquals(30, sum);
   }
}
