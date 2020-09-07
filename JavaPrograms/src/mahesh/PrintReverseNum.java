//Write	a	program	to	Print REVERSE	of	N	to	1 numbers?

/**package mahesh;
public class PrintReverseNum {
	public static void main(String[] args) {
		int a = 10;
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}

	}

}
 **/
package mahesh;
public class PrintReverseNum {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		for(int i=n;i>0;i--) {
			System.out.println(i);
		}

	}
}