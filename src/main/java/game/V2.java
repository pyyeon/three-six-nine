package game;

import java.util.Scanner;

public class V2 {
    public static void main(String[] args) {
        //사용자에게 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String player = sc.nextLine();
        System.out.println("몇까지 게임을 진행하시겠습니까?");
        int n = sc.nextInt();
        sc.nextLine();
        //틀린 횟수
        int err = 0;
        //오답률이 n/err * 100 > 30 이면 종료

        int num = 0;
        int tries = 0;

        boolean isOver = false;
        int result = 0;

        while (num < n && !isOver) {
            //주고 받아야하니까 짝수는 Scnner
            num++;
            int maxTries = n / 2;  // 플레이어가 몇 번 입력할지 최대값
            double limit = maxTries * 0.3;  // 허용 오답 한도
            if (num % 2 != 0) {
                System.out.println(clap(num));
            } else {
                System.out.print("입력: ");
                String input = sc.nextLine();
                tries++;
                if (!clap(num).equals(input)) {
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
        System.out.println("플레이어 " + player + " " + resultMsg );

    }

    public static String clap(int n) {
        //  //3,6,9가 포함되었는지 판별한느 메서드

        String s = String.valueOf(n);
        if (s.contains("3") || s.contains("6") || s.contains("9")) {
            s = "*";
        }
        return s;
    }
}
