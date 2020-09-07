/**package mahesh;

public class Printnums {
	public static void main(String[] args) {
		int a = 11;
		for(int i1=1; i1<11; i1++ )
		{
			System.out.println(i1);
		}
	}
}
 **/
//Write	a program to Print 1 to	N numbers?
/**package mahesh;

public class Printnums {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		for(int b : a )
		{
			System.out.println(b);
		}
	}
}
 **/
package mahesh;

public class Printnums {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the numeber:");
		int x = sc.nextInt();
		for(int i=0;i<x;i++)
		{
			System.out.print(i);
		}
	}
}

