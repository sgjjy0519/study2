
//4개의 값을 콘솔에서 입력받아 처리하시오
//조건) 성별 : M 이면 "남자", 나머지 "여자" (삼항연산자 이용)
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Input name : ");
		String name = s.nextLine();
		System.out.print("Input gender(M/F) : ");
		String gender = s.nextLine();
		System.out.print("Input age : ");
		int age = s.nextInt();
		System.out.print("Input tall : ");
		double tall = s.nextDouble();

		System.out.println("이름 : " + name);
		System.out.println("성별 : " + (gender == "M" ? "남자" : "여자"));
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + tall);
	}

}
