import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    *   Prime # calculator-> whole number greater than one where [only] two factors can be calculated
    *   first try dividing it by 2, and see if you get a whole number. If you do, it can't be a prime number.
    *   If you don't get a whole number, next try dividing it by prime numbers: 3, 5, 7, 11 (9 is divisible by 3)
    *   and so on, always dividing by a prime number (see table below).
    * */


public class PrimeNumbers {
    public static void main(String[] args){
    System.out.println("Enter Limit to Calculate primes");
    Scanner scanner = new Scanner(System.in);
    int limit = scanner.nextInt();


    List<Integer> prime_numbers_array = new ArrayList<>();
    List<Integer> non_prime_numbers_array = new ArrayList<>();
    for (int check_number=2; check_number <= limit; check_number++){
        boolean isPrime = true;
        for (int check_factor = 2; check_factor <= check_number/2; check_factor++){
            if (check_number % check_factor == 0){
                /* checks if # dvisiable to 0  */
                System.out.println(check_number + "is not a prime # ");
                non_prime_numbers_array.add(check_number);
                isPrime = false;
                break;
            }if(isPrime){
                System.out.println(check_number + "is a prime # ");
                prime_numbers_array.add(check_number);
            }
        }

    }
        System.out.println("[PRIME]: " + prime_numbers_array);
        System.out.println("[PRIME-LENGTH]" + prime_numbers_array.size());
        System.out.println("[NON-PRIME]: " + non_prime_numbers_array);
        System.out.println("[NON-PRIME-LENGTH]" + non_prime_numbers_array.size());

    }
}
