package exercise.states;

import exercise.AlarmClock;

public class AlarmState implements State {

    private AlarmClock alarmClock;

    public AlarmState(AlarmClock alarmClock) {
        this.alarmClock = alarmClock;
    }

    @Override
    public String getName() {
        return "alarm";
    }

    @Override
    public void clickMode() {
        alarmClock.setState(new ClockState(alarmClock));
    }

    @Override
    public void longClickMode() {
        alarmClock.changeAlarmStatus();
    }
}
