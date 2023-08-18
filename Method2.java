import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
    System.out.println("-----> Main() Started ");
    multiplyNumbers();
    System.out.println("-----> Main() Ended");
	}

	public static void multiplyNumbers() {
		System.out.println("---->multiplyNumbers() Started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number=");
		int a=scan.nextInt();
		System.out.println("Enter Second number");
		int b=scan.nextInt();
				int mul = a*b;
		System.out.println("The multiplication=" +mul);
		System.out.println("----->multiplyNumbers() Ended");
		scan.close();
	}
}

