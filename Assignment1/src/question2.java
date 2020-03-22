import java.util.Random;
import java.util.Scanner;
public class question2 {
	
	public static boolean Make_question() {
		
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);
		
		int first,second,userAnswer,answer;
		
		first = generator.nextInt(10);
		second = generator.nextInt(10);
		answer = first*second;
		
		System.out.printf("How much is %d times %d?\n", first,second);
		
		while(true) {
		System.out.println("Enter your answer (-1 to exit): ");
		userAnswer = sc.nextInt();
		
		if(userAnswer == -1) {return false;}
		
		else if(userAnswer == answer) {System.out.println("Very Good!"); return true;}
		
		else {
			System.out.print("No, Please try again.\n");
		}
		
		}
	
		
	}
	

	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			flag = Make_question();
		}
	
	}

}
