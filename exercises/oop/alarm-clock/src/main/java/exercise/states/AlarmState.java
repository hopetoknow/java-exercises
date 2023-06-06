package exercise.states;

import exercise.AlarmClock;

public final class AlarmState implements State {

    private final AlarmClock alarmClock;

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

    @Override
    public void clickH() {
        alarmClock.addOneAlarmHour();
    }

    @Override
    public void clickM() {
        alarmClock.addOneAlarmMinute();
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
