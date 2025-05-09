package game.V4;


import game.V3.rule.BusanRule;
import game.V3.rule.GameRule;
import game.V3.rule.SeoulRule;


import java.util.Scanner;

public class V4 {
    // 4단계: 동시성 적용
// 각 Game 클래스가 Runnable을 구현하여 멀티스레드로 실행되도록 설계
// 메인에서 Thread로 감싸서 start() 호출로 병렬 실행
// 스캐너는 멀티스레드 환경에서 충돌 > 추후 별도 입력 큐 처리 고려
// 출력 충돌 방지를 위해 synchronized 블록 또는 별도 Logger 설계 가능
    static GameRule rule;
    static int n = 20;

    public static void main(String[] args) throws InterruptedException {

        SyncronizedGame BusanGame = new SyncronizedGame(new BusanRule(), n, "busan");
        SyncronizedGame SeoulGame = new SyncronizedGame(new SeoulRule(), n, "seoul");

        Thread t1 = new Thread(SeoulGame);
        Thread t2 = new Thread(BusanGame);


        t1.start();
        t2.start();

    }


}
