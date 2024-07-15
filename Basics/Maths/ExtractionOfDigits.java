import java.util.Scanner;

public class ExtractionOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of n: ");
        int n = sc.nextInt();
        extractDigits(n);
    }

    public static void extractDigits(int n){
        System.out.print("The digits of this number (in reverse order) are:  ");
        while(n > 0){
            int lastDigit = n%10;
            System.out.print(lastDigit + " ");
            n = n/10;
        }
        System.out.println();
    }
}