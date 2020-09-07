/** package mahesh;

public class Sumnum {
	public static void main(String[] args) {
		int a = 10;
		int b = 50;
		int c = a+b;
		System.out.println(c);
	}

}
 **/
//Write	a	program	to	display	sum	of	1	to	N	numbers?
package mahesh;
public class Sumnum
{
	public static void main(String[] args)	
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter value of n:");
		int n=sc.nextInt();
		int sum=0;
		for(int	i=1;i<=n;i++) //n(n+1)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
}
