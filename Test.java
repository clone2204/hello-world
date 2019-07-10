
public class Test
{
   public static void main(String[] args)
   {
      int a = 5;
      int b = 12;

      System.out.println("Biggest Brain Add: " + a + " + " + b + " = " + BigBrainAdd(a, b));
   }

   public static int BigBrainAdd(int a, int b)
   {
      int result = a;
      
      for(int loop = 0; loop < b; loop++)
      {
         result++;
      }

      return result;
   }
}
