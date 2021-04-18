import java.util.Scanner;

//2개의 숫자와 연산자를 입력하여 계산하시오
//조건1) 실수인경우는 소수이하 2째자리까지 출력하시오
//조건2) 연산자가 +,-,*,/ 이외의 문자가 들어오면 "연산자error"출력하시오

public class ex5 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("A값을 입력하시오 : ");
		int a = s.nextInt();
		System.out.print("B값을 입력하시오 : ");
		int b = s.nextInt();
		System.out.print("연산자를 입력(+,-,*,/) : ");
		char op = s.next().charAt(0);
		
		switch(op) {
		case '+':
			System.out.printf("%d %c %d = %d",a,op,b,a+b);
			break;
		case '-':
			System.out.printf("%d %c %d = %d",a,op,b,a-b);
			break;
		case '*':
			System.out.printf("%d %c %d = %d",a,op,b,a*b);
			break;
		case '/':
			System.out.printf("%d %c %d = %.2f",a,op,b,(double)a/b);
			break;
		default :
			System.out.println("연산자 Error");
		}
		
	}
}
