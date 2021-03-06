package commands;

import expressions.ShuntingYard;

public class SleepCommand implements Command {
    @Override
    public void execute(String[] array) {
        try {
            Thread.sleep((long)ShuntingYard.calc(array[1]));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
