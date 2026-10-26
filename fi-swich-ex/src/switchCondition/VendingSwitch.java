package switchCondition;

import java.util.Scanner;

public class VendingSwitch {
    public static void main(String[] args) {
        // 1. 스캐너 생성
        Scanner scanner = new Scanner(System.in);

        // 2. 초기 잔액
        int balance = 0;

        while (true) {
            // 3. 메뉴 출력
            System.out.println("===================");
            System.out.println("자판기 메뉴");
            System.out.println("1. 금액 투입");
            System.out.println("2. 음료 구매");
            System.out.println("3. 잔액 확인");
            System.out.println("4. 종료");
            System.out.println("===================");
            System.out.print("번호 입력 : ");

            int menu = scanner.nextInt();

            // 4. 메뉴별 처리
            switch (menu) {
                case 1:
                    System.out.print("투입할 금액을 입력하세요 : ");
                    int money = scanner.nextInt();

                    if (money > 0) {
                        balance += money;
                        System.out.println("금액이 투입되었습니다.");
                    } else {
                        System.out.println("올바른 금액을 입력하세요.");
                    }
                    break;

                case 2:
                    System.out.println("음료를 선택하세요.");
                    System.out.println("1. 커피 (1500원)");
                    System.out.println("2. 주스 (1000원)");
                    System.out.println("3. 물 (500원)");
                    System.out.print("음료 번호 입력 : ");

                    int drink = scanner.nextInt();
                    int price = 0;
                    String name = "";

                    switch (drink) {
                        case 1:
                            price = 1500;
                            name = "커피";
                            break;
                        case 2:
                            price = 1000;
                            name = "주스";
                            break;
                        case 3:
                            price = 500;
                            name = "물";
                            break;
                        default:
                            System.out.println("잘못 선택했습니다.");
                            break;
                    }

                    if (price > 0) {
                        if (balance >= price) {
                            balance -= price;
                            System.out.println(name + "가 나왔습니다.");
                            System.out.println("남은 잔액 : " + balance + "원");
                        } else {
                            System.out.println("잔액이 부족합니다.");
                            System.out.println("현재 잔액 : " + balance + "원");
                        }
                    }
                    break;

                case 3:
                    System.out.println("현재 잔액 : " + balance + "원");
                    break;

                case 4:
                    System.out.println("잔돈 " + balance + "원을 반환합니다.");
                    System.out.println("자판기를 종료합니다.");
                    scanner.close();
                    return;

                default:
                    System.out.println("잘못 선택했습니다.");
            }
        }
    }
}
