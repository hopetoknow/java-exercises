package exercise.states;

import exercise.AlarmClock;

public class BellState implements State {

    private final AlarmClock alarmClock;

    public BellState(AlarmClock alarmClock) {
        this.alarmClock = alarmClock;
    }

    @Override
    public String getName() {
        return "bell";
    }

    @Override
    public void clickMode() {
        alarmClock.setState(new ClockState(alarmClock));
    }

    @Override
    public void longClickMode() {
        alarmClock.setState(new ClockState(alarmClock));
    }

    @Override
    public void clickH() {

    }

    @Override
    public void clickM() {

    }

    @Override
    public void tick() {
        alarmClock.addOneMinute();
        alarmClock.setState(new ClockState(alarmClock));
    }
}
