package game.V3;

import game.V3.rule.GameRule;

import java.util.Scanner;

import static game.V2.clap;

public class Game {
    private GameRule rule;
    private int maxNumber;
    private String playerName;
    public Game(GameRule rule, int maxNumber, String playerName){
        this.rule = rule;
        this.maxNumber = maxNumber;
        this.playerName = playerName;
    }

    public  void start() {
        Scanner sc = new Scanner(System.in);
        //틀린 횟수
        int err = 0;
        //오답률이 n/err * 100 > 30 이면 종료
        int num = 0;
        int tries = 0;
        int maxTries = maxNumber/2;
        double limit = maxTries * 0.3;
        boolean isOver = false;
        int result = 0;

        while (num < maxNumber && !isOver) {
            //주고 받아야하니까 짝수는 Scnner
            num++;
             // 플레이어가 몇 번 입력할지 최대값
             // 허용 오답 한도
            if (num % 2 != 0) {
                System.out.println(rule.check(num));
            } else {
                System.out.print("입력: ");
                String input = sc.nextLine();
                tries++;
                if (!rule.check(num).equals(input)) {
                    err++;
                }

                if(err > limit)  {
                    System.out.println("오답률 30초과!");
                    isOver = true;
                }

            }

        }
        System.out.println("게임 종료!");
        System.out.printf("오답률 : %.2f%%" , (err * 100.0 / tries));
        System.out.println();
        String resultMsg = isOver ? "패배" : "승리";
        System.out.println("플레이어 " + playerName + " " + resultMsg );

    }




}
