import java.util.Scanner;
public class question1 {
	
	public static double cal(int hours) {
		double fee;
		if(hours<=3) {fee = 2.00; return fee;}
		else {
			hours -= 3;
			fee = 2.00 + 0.5*hours;
			if(fee>10.00) {fee=10.00; return fee;}
			else {return fee;}
		}
	
	
	}

	public static void main(String[] args) {
		double sumOfFee = 0;
		while (true) {
			int hours;
			double fee;
			Scanner input = new Scanner(System.in);
			System.out.printf("Enter number of hours(a negative to quit): ");
			hours = input.nextInt();
			if(hours<0) {break;}
			fee = cal(hours);
			sumOfFee += fee;
			System.out.printf("Current charge : $%.2f, Total receipts: $%.2f",fee,sumOfFee);
			System.out.println();
			
		}
		
	}

}
