package game.V3.rule;

public class BusanRule implements GameRule {

    @Override
    public String check(int number) {
        String s = String.valueOf(number);

        if (s.contains("3") || s.contains("6") || s.contains("9") || number % 5 == 0) {
            return "*";
        }
        return s;
}}
