
// PRINT SUM OF 10 NATURAL NUMBER USING RECURSION IN JAVA
public class SumOfNaturalNumber {
public static void main(String[] args){
    int total = sum(11);
    System.out.println("Sum of 11 Natural number = " + total);
}
static int sum(int n){
    if(n>0){
        return n + sum(n-1);
    }
    else {
        return 0;
    }
}
    }


