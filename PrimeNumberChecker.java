import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        boolean valid = true;

        System.out.println("Please enter a number.");
        num = scan.nextInt();

        if (num == 0 || num == 1) {
            System.out.println("These numbers are not considered prime numbers in this program.");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    valid = false;
                    break; // Breaks out of the loop if the number is not prime, which makes my job so easy. (YES I GOT THIS FROM ONLINE, YES I KNOW WE HAVEN'T LEARNED THIS YET
                }
            }
        }

        System.out.println(valid);
    }
}