package Project;

import java.io.IOException;
import java.util.Scanner;


public class PosApp {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=====================================");
            System.out.println("*           POS 메인 프로그램       *");
            System.out.println("=====================================");
            System.out.println("1. 주문");
            System.out.println("2. 메뉴관리");
            System.out.println("3. 카테고리관리");
            System.out.println("4. 매출표확인");
            System.out.println("5. 종료");
            System.out.print("> 메뉴 선택: ");
            System.out.print("");

            int mainMenu = sc.nextInt();
            sc.nextLine(); // 줄바꿈 처리

            switch (mainMenu) {
                case 1:
                    OrderApp.run(sc); // 주문 모듈 실행
                    break;
                case 2:
                	MenuApp.run(sc);
                    break;
                case 3:
                	CategoryMain.run(sc);
                    break;
                case 4:
                    SaleApp.run(sc); // 매출표 확인 모듈 실행
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.\n");
            }
        }
    }
}