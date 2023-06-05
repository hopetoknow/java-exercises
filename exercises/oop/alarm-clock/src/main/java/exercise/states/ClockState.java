package exercise.states;

import exercise.AlarmClock;

public class ClockState implements State {

    private final AlarmClock alarmClock;

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

    @Override
    public void clickH() {
        alarmClock.addOneHour();
    }

    @Override
    public void clickM() {
        alarmClock.addOneMinute();
    }

    @Override
    public void tick() {
        alarmClock.addOneMinute();
        int currentMinutes = alarmClock.getMinutes();

        if (currentMinutes == 0) {
            alarmClock.addOneHour();
        }

        if (alarmClock.isAlarmTime() && alarmClock.isAlarmOn()) {
            alarmClock.setState(new BellState(alarmClock));
        }
    }
}
