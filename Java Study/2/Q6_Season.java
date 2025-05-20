import java.util.Scanner;

public class Q6_Season {

	public static void main(String[] args) {
		String season;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("달을 입력하세요(1~12) >> ");
		
		int month = scanner.nextInt();
		
		if( month >= 3 && month <= 5 )
			season = "봄";
		else if( month >= 6 && month <= 8 )
			season = "여름";
		else if( month >= 9 && month <= 11)
			season = "가을";
		else if( month == 1 || month == 2 || month == 12)
			season = "겨울";
		else 
			season = "잘못 입력하였습니다.";
		System.out.println(season);
		
		scanner.close();
	}

}

