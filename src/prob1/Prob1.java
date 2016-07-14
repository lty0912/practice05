package prob1;
import java.util.Scanner;


public class Prob1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		System.out.print( "문자열을 입력하세요:" );
		
		String s = scanner.nextLine();
		s = s.toUpperCase();
		
		/*  구현합니다. */

		char[] charArray = s.toCharArray();
		String result = "";
		
		for(int i=0; i<charArray.length; i++) {
			result += charArray[i];
			System.out.println(result);
		}
		
		
		scanner.close();
	}
}
