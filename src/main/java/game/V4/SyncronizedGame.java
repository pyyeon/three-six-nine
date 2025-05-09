package game.V4;

import game.V3.Game;
import game.V3.rule.GameRule;

public class SyncronizedGame  extends Game implements Runnable {

    private GameRule rule;
    private int maxNumber;
    private String playerName;

    public SyncronizedGame(GameRule rule, int maxNumber, String playerName) {
        super(rule, maxNumber, playerName);
    }


    @Override
    public void run() {
        start();
    }


}

