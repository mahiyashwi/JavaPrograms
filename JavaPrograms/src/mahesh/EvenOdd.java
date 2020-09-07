//Write	a	program	to	check	given	number	is	EVEN	or	ODD?
package mahesh;

public class EvenOdd {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter numberr:");
		int n = sc.nextInt();
		if(n%2==0)
			System.out.println("n is even number");
		else
			System.out.println("n is odd number");
	}

}
