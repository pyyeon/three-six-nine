package game.V3;

import game.V3.rule.BusanRule;
import game.V3.rule.GameRule;
import game.V3.rule.SeoulRule;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String player = sc.nextLine();

        System.out.println("몇까지 게임을 진행하시겠습니까?");
        int n = sc.nextInt();
        sc.nextLine();
        int choice;
        GameRule rule;
        while (true) {
            System.out.println("룰을 선택하세요: \n" + "1) 서울 \n" + "2) 부산 \n");
            System.out.print("선택 >> ");
            choice = sc.nextInt();
            sc.nextLine();


            if (choice == 1) {
                rule = new SeoulRule();
                break;
            } else if (choice == 2) {
                rule = new BusanRule();
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해 주세요. ");
            }
        }
        Game game = new Game(rule, n, player);
        game.start();

    }

}
