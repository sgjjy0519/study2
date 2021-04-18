//입력받아 두수중 큰수를 출력하시오
//(단, 비교연산은 삼항연산자를 이용하시오)
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 int a,b;
		 
		 System.out.print("Input a : ");
		 a= Integer.parseInt(s.nextLine());
		 System.out.print("Input b : ");
		 b= Integer.parseInt(s.nextLine());
		 
		 System.out.println("큰수 : " +(a>b ? a:b));
	}

}
