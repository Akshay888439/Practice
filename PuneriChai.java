import java.util.Scanner;

public class PuneriChai {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter no of Chai");
	int quantity=scan.nextInt();
	double bill=orderchai(quantity);
	System.out.println(bill);
	}

	private static double orderchai(int quantity) {
		// TODO Auto-generated method stub
		return 10*quantity;
	}
    
}
