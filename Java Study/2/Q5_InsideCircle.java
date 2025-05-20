import java.util.Scanner;

public class Q5_InsideCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 중심과 반지름을 입력하시오. >> ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double r = scanner.nextDouble();

        System.out.print("점을 입력하시오. >> ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        // 원 내부 판별: 원의 중심과 점 사이의 거리 계산
        double distance = Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));

        if (distance <= r) {
            System.out.println("점(" + x + ", " + y + ")는 원 안에 있습니다.");
        } else {
            System.out.println("점(" + x + ", " + y + ")는 원 안에 없습니다.");
        }

        scanner.close();
    }
}
