import java.util.Scanner;
//Sum of prime numbers from 1 to n

public class sumofprime {
//	logic for prime number
	private static boolean isPrime(int num) {
        if (num <= 1) return false; 
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) 
            	return false; 
        }
        return true; 
    }
//	logic for addition of prime numbers
	public static int sum(int n) {
		int sum=0;
		for (int i=2;i<=n;i++)
		{
			if(isPrime(i))
			{
			sum+=i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Sum of Prime numbers 1 to N: "+sum(n));
	}
	
}
