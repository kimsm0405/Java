import java.util.Scanner;

public class Q2_MoneyChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하시오. >> ");
        int amount = scanner.nextInt();

        int[] currencyUnits = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        String[] currencyNames = {"오만 원권", "만 원권", "천 원권", "500원짜리 동전", "100원짜리 동전", "50원짜리 동전", "10원짜리 동전", "1원짜리 동전"};

        for (int i = 0; i < currencyUnits.length; i++) {
            int count = amount / currencyUnits[i];
            amount %= currencyUnits[i];
            System.out.println(currencyNames[i] + ": " + count + "개");
        }

        scanner.close();
    }
}