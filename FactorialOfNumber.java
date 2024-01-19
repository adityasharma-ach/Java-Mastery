public class FactorialOfNumber {
    public static void main(String[] args){
        int factorial = fact(10);
        System.out.print("Factorial of 5! is = " + factorial);
    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        else {
            return n * fact(n+1);
        }
    }
}
