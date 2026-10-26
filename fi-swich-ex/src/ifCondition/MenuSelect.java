package ifCondition;

import java.util.Scanner;

public class MenuSelect {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coffeePrice = 1500;
        int juicePrice = 1000;
        int waterPrice = 500;
        System.out.println("금액을 입력하세요.");
        int money = scanner.nextInt();
        String result;
        if (money >= coffeePrice) {
            result = "커피,쥬스,물 모두 구매 가능합니다.";
        } else if (money >= juicePrice) {
            result = "쥬스,물 구매 가능합니다.";
        } else if (money >= waterPrice) {
            result = "물만 구매 가능합니다.";
        } else {
            result = "잔액이 부족합니다.";
        }
        System.out.println(result);
    }
}