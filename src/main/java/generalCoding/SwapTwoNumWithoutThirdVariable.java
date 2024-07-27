package generalCoding;

public class SwapTwoNumWithoutThirdVariable {

   public void swap(int a, int b){
       b = b+a;
       a = b-a;
       b = b-a;
       System.out.println("After Swapping numbers a is "+a+" and b is "+b);
   }
}
