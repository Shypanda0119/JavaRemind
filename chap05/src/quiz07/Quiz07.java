package quiz07;
import java.util.*;
public class Quiz07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int balance = 0;
		int inMoney = 0;
		int outMoney = 0;
		int sumMoney = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.println("선텍> ");
			balance = Integer.parseInt(scanner.nextLine());
			switch(balance) {
				case 1:
					System.out.println("예금액> ");
					inMoney = Integer.parseInt(scanner.nextLine());
					sumMoney += inMoney;
					break;
				case 2:
					System.out.println("출금액> ");
					outMoney += Integer.parseInt(scanner.nextLine());
					sumMoney -= outMoney;
					break;
				case 3:
					System.out.println("잔고> " + sumMoney);
					break;
				case 4:
					System.out.println("프로그램 종료");
					run = false;
					break;	
			}
		}
		
	}

}
