package edu.kh.op.practice;

import java.util.Scanner; // Sanner 가져오겠다는 이야기 

public class OpPractice {
	
	// 코드는 위에서 아래, 왼쪽에서 오른쪽으로 읽는게 코드의 흐름 이름이라고 한다
	// 건너 뛰고, 반복하고, 처음으로 돌아가는 것을 제어문 어? 근데 언제 앞에것을 실행해요? 이게 조건문 
	

	// 실습문제 1
	// 모든 사람이 사탕을 골고루 나눠가지려고 한다.
	// 인원 수와 사탕 개수를 키보드로 입력 받고
	// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요
	/*
	 * [실행화면] 인원 수 : 29 사탕 개수 : 100
	 * 
	 * 
	 * 1인당 사탕 개수 : 3 남은 사탕 개수 : 13
	 */
	
	// Scanner sc = newScanner(System.in);
	// System.out.print("인원 수: ");
	// int people = sc.newInt();

	public void practice1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("인원 수 ");

		int people = sc.nextInt();

		System.out.print("사탕 개수 ");

		int candy = sc.nextInt();

		System.out.printf(" 1인당 사탕 개수 : %d\n ", candy / people);
		System.out.printf(" 남은 사탕 개수 : %d\n ", candy % people);

	}

	public void practice2() {
		
	//실습문제 2
	// 정수를 하나 입력 받아 짝수 / 홀수를 구분하세요 
	// (0은) 짝수로 취급합니다.)
			
	/* [실행화면]
	 * 정수 입력 : 2
	 * 짝수 입니다.
	 * */
	
			
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수 입력 : ");
	int iNum1 = sc.nextInt();
	
	//조건식 ? 식1 : 식2;
	
	String result = ((iNum1 % 2 == 0) ? "짝수입니다. " : "홀수입니다. ");
	System.out.println(result);
  
	}

	// 실습문제 3
	// 나이를 키보드로 입력 받아 어린이(13세 이하)인지,
	// 청소년(13세 초과 ~ 19세 이하)인지, 
	// 성인(19세 초과) 인지 출력하세요
	/*
	 * [실행화면] 나이 : 19
	 * 
	 * 청소년
	 */
	
	

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();

		System.out.println(age <= 13 ? "어린이" : (age > 19 ? "성인" : "청소년"));
		
		
		
	}

	// 실습문제 4	
	// 키보드로 정수 두개를 입력 받아 각각 변수(num1, num2)에 저장하세요
	// 그리고 또 다른 정수를 입력 받아 그 수가 num1 이하이거나 num2 초과이면 true를 출력하고
	// 아니면 false를 출력하세요
	// (단, num1은 num2 보다 작아야함)
	/*
	 * [실행화면] 정수1 : 4 정수2 : 11 입력 : 13
	 * 
	 * true
	 * 
	 */
	

	public void practice4() {
		
	   Scanner sc = new Scanner(System.in); 
	   
	   System.out.print("정수1 : "); // 실행화면에 "정수1 : " 가 나오게 기입
	   int num1 = sc.nextInt(); // 정수 하나를 받을거니까 변수 선언
	   
	   System.out.print("정수2: "); // 실행화면에 "정수2 : "가 나오게 기입
	   int num2 = sc.nextInt(); // 정수 하나를 받을거니까 변수 선언
	   
	   System.out.print("입력 : "); // 실행화면에 "입력 : "가 나오게 기입
	   int input = sc.nextInt(); // 정수 하나를 받을거니까 변수 선언
	   
	   String result = ((num1 >= input) || (num2 < input) ? "true" : "false"); // 삼항연산자와 논리연산자 사용 
	   System.out.print(result); 
	   
	   	
			 
	}
	
	// 실습문제 5
	// 3개의 수를 키보드로 입력 받아 입력 받은 수가
	// 모두 같으면 true, 아니면 false를 출력하세요
	/*
	 * [실행화면] 입력1 : 5 입력2 : -8 입력3 : 5
	 * 
	 * false
	 * 
	 */

	public void practice5() {
		
		 Scanner sc = new Scanner(System.in); // Sanner 먼저 선언
		 
		 System.out.print("입력1 : "); // 입력 화면 생성
		 int input1 = sc.nextInt(); // 입력 받겠다고 선언
		 
		 System.out.print("입력2 : ");
		 int input2 = sc.nextInt();
		 
		 System.out.print("입력3 : ");
		 int input3 = sc.nextInt();
		 
		 String result = (((input1 == input2) && (input2 == input3)) ? "true" : "false"); // &&연산자 사용하면 되겠구나 
		 System.out.print(result); // 마지막 출력 기입
	}
	
	public void practice6 () {
		
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("당신의 점수를 입력해주세요: ");
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		System.out.printf("당신의 점수는 %d입니다 : ", score);
		
		if (score >= 90) {
			grade = 'a';
			if (score >=98) {
				opt = '+';
			} else if (score <94) {
				opt = '-';
			}
		} else if (score >=80) {
			grade = 'b';
			if (score >=88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
		} else {
			grade = 'c';
		}
		System.out.printf("당신의 점수는 %d%d입니다.%\n", score, opt);		
		
		
		
	}
		
	
}


