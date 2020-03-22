import java.util.Random;
import java.util.Scanner;
public class question3 {
	
	static String words_for_answer [] = {"Very Good","Excellent!","Nice work","Keep up the good work"};
	static String words_for_wrong [] = {"No.Please try again","Wrong. Try once more.","Don't give up","No. Keep trying"};
 	
	public static boolean Make_question() {
		
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);
		
		int first,second,userAnswer,answer;
		
		first = generator.nextInt(10);
		second = generator.nextInt(10);
		answer = first*second;
		
		System.out.printf("How much is %d times %d?\n", first,second);
		
		while(true) {
			
		int idx1 = generator.nextInt(4);
		int idx2 = generator.nextInt(4);
		
		System.out.println("Enter your answer (-1 to exit) : ");
		userAnswer = sc.nextInt();
		
		if(userAnswer == -1) {return false;}
		
		else if(userAnswer == answer) {System.out.printf("%s\n",words_for_answer[idx1]); return true;}
		
		else {
			System.out.printf("%s\n",words_for_wrong[idx2]);
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
