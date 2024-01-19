// PRINT : SUM OF NATURAL NUMBER 5 TO 10 USING RECURSION IN JAVA
public class SumOfNaturalNumber2 {
   public static void main(String[] args){
       int total = sum(5, 10);
       System.out.print("Sum of Natural number between 5 to 10 = " + total);
   }
   public static int sum(int start, int end){
       if(end>start){
           return end + sum(start, end-1);
       }
       else {
           return end;
       }
   }
}



