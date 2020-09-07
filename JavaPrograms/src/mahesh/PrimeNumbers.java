
//Write	a	program	to	display	PRIME	NUMBERS	from	1	to	n?
package mahesh;
public class PrimeNumbers {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		for(int i=1; i<n; i++)
		{
			boolean isPrime = true;
			for (int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime= false;
					break;
				}
			}
			if(isPrime)
				System.out.print(i+"");
		}
	}
}
