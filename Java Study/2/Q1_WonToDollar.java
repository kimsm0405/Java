import java.util.Scanner;

public class Q1_WonToDollar {

	public static void main(String[] args) {
		char dollar;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원) >> ");
		int won = scanner.nextInt();
		
		System.out.println(won + "원은 $" + (won / 1200) + "입니다." );

	}

}
