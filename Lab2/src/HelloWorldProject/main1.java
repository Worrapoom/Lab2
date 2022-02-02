package HelloWorldProject;

import java.util.Scanner;

public class main1 {
		
	static void showNum(int num) {
		for(int i = 1 ; i <= num ; i++) {
			System.out.print(i);
			if(i%5 != 0 && i != num) {
				System.out.print(", ");
			} else {
				System.out.println(); }
		}//end for
	}//end show num
		
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter your value : ");
		int num = userInput.nextInt();
		System.out.println("-----------------------");
		showNum(num);
	}//end main
		
}//end class