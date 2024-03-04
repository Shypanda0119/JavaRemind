package quiz09;
import java.util.Scanner;
public class Quiz09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 수: ");
		String firstNum = scanner.nextLine();
		double fNumber = Double.parseDouble(firstNum);
		
		System.out.println("두번째 수: ");
		String SecondNum = scanner.nextLine();	
		double sNumber = Double.parseDouble(SecondNum);
		
		System.out.println("---------------------");
		if( sNumber == 0.0) {
			System.out.println("결과: 무한대"); 
		} else {
			System.out.println("결과: " + (fNumber / sNumber)); 
		}
	}
}
