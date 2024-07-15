import java.util.Scanner;

public class CountDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        long n = sc.nextLong();
        System.out.println("The number of digits is: " + countDigit1(n));
        System.out.println("The number of digits is: " + countDigit2(n));
    }

    public static int countDigit1(long n){
        if(n == 0) return 1;
        int digitCount = 0;
        while(n > 0){
            n = n/10;
            digitCount++;
        }

        return digitCount;
    }

    public static int countDigit2(long n){
        if(n == 0) return 1;
        return (int)Math.log10(n) + 1;
    }
}