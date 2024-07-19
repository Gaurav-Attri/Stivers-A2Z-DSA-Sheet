import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int n = sc.nextInt();

        System.out.println("The reverse of the number is: " +  reverse1(n));
        System.out.println("The reverse of the number is: " + reverse2(n));
    }

    // Takes care of both negative as well as the positive numbers because we've changed the conditon of while loop 
    // from "n > 0" to "n != 0" thus it will work for negative numbers as well.
    // Modulo property -> The result of modulo operator takes sign of the dividend. So in case of negative numbers, 
    // the result will be negative and that's why the following method works.
    public static int reverse1(int n){
        int ans = 0;

        while(n != 0){
            int digit = n%10;
            ans = ans*10 + digit;
            n = n/10;
        }

        return ans;
    }


    // This implementation of reverse handles the case when reversing the number may result in a number that is outside of range of 
    // integer so in those cases, it will return 0.
    public static int reverse2(int n){
        int ans = 0;

        while(n != 0){
            if((ans > Integer.MAX_VALUE/10) || (ans < Integer.MIN_VALUE/10)) return 0;
            int digit = n%10;
            ans = ans*10 + digit;
            n = n/10;
        }

        return ans;
    }
}