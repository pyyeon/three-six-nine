package game;

public class V1 {
    //기본 369 게임 구현
    //문제 설명
    //
    //1부터 N까지의 숫자를 출력하는 프로그램을 작성하라. 단, 숫자 중에 3, 6, 9가 포함된 자리수는 숫자 대신 박수를 출력한다.
    //
    //1부터 N까지 순서대로 출력
    //
    //박수는 *로 표시한다
    public static void main(String[] args) {
        int n = 15;  // 또는 (int)(Math.random() * 100) + 1;

        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            if (s.contains("3") || s.contains("6") || s.contains("9")) {
                System.out.println("*");
            } else {
                System.out.println(s);
            }
        }
    }
}
