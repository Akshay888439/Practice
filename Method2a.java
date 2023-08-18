import java.util.Scanner;

public class Method2a {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int addition= addnumbers(a,b);
		System.out.println("addition=" +addition);

	}

	private static int addnumbers(int x ,int y) {
		return x+y ;
	}


}
