//값을 입력받아 0보다 작거나 100보다 크면 "입력오류!!"  출력
//        (if문과 ||연산자를 이용하시오)
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("점수입력 : ");
		int a = s.nextInt();
		
		if(a >= 100 || a <= 0 ) 
			System.out.println("입력오류!!");
		else	
		 System.out.println("입력된 값 : "+a);
		
	}

}
