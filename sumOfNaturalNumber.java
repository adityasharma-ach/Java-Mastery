//Sum of Natural Number: Example take 5 So it become 5+4+3+2+1 = 15;

//METHOD 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

/*public class sumOfNaturalNumber {
    public static void main(String[] args){
        int result = sum(11);
        System.out.println("sum of 10 natural number = " + result);
    }
    static int sum(int k){
        if(k>0){
            return k + sum(k-1);
        }
        else {
            return 0;
        }
    }
}*/

// METHOD 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.

/*public class sumOfNaturalNumber{
    public static void main(String[] args){
        int result = sum(5, 10);
        System.out.println("Sum to between 5 to 10 is = " + result);
    }
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
    }
    }
} */

// TESTING OF METHOD 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.....

public class sumOfNaturalNumber{
    public static void main(String[] args){
        int result = sum(6, 10);
        System.out.println("Sum to between 5 to 10 is = " + result);
    }
    public static int sum(int start, int end) {
        if (start > end) {
            return end;
        } else {
            return start + sum(start, end - 1);
        }
    }
}
