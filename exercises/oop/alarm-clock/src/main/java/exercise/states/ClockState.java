package exercise.states;

import exercise.AlarmClock;

public class ClockState implements State {

    private AlarmClock alarmClock;

    public ClockState(AlarmClock alarmClock) {
        this.alarmClock = alarmClock;
    }

    @Override
    public String getName() {
        return "clock";
    }

    @Override
    public void clickMode() {
        alarmClock.setState(new AlarmState(alarmClock));
    }

    @Override
    public void longClickMode() {
        alarmClock.changeAlarmStatus();
    }
}
