import java.util.Scanner;
// sum of range from m to n 

public class sumofrange {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int m=sc.nextInt();
	int n=sc.nextInt();
	int sum=sumof(m,n);
	System.out.println("Sum of Range M TO N:"+sum);
}

private static int sumof(int m, int n) {
	// TODO Auto-generated method stub
	int sum=0;
	if(m>n)
	{
		int temp =m;
		m=n;
		n=temp;
	}
	for (int i=m;i<=n;i++)
	{
		 sum += i;
	}
	return sum;
}
}
