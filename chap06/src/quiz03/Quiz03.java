package quiz03;

import java.util.Scanner;
public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studenNum = 0;
		int[] scores = null;
		int max = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studenNum = Integer.parseInt(scanner.nextLine());
			}else if(selectNo == 2) {
				scores = new int[studenNum];
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> ", i);
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			}else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> %d\n", i, scores[i]);
				}
			}else if(selectNo == 4) {
				for(int i=0; i<scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + (double)sum / scores.length);
			}else {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}

}
