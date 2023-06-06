package exercise;

import exercise.states.ClockState;
import exercise.states.State;

public final class AlarmClock {

    private int hours;
    private int minutes;
    private int alarmHours;
    private int alarmMinutes;
    private boolean isAlarmOn;

    private State state;

    public AlarmClock() {
        this.hours = 12;
        this.minutes = 0;
        this.alarmHours = 6;
        this.alarmMinutes = 0;
        this.isAlarmOn = false;
        this.state = new ClockState(this);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getAlarmHours() {
        return alarmHours;
    }

    public int getAlarmMinutes() {
        return alarmMinutes;
    }

    public boolean isAlarmOn() {
        return isAlarmOn;
    }

    public State getState() {
        return state;
    }

    public String getCurrentMode() {
        return getState().getName();
    }

    public boolean isAlarmTime() {
        return hours == alarmHours && minutes == alarmMinutes;
    }

    public void addOneHour() {
        hours += 1;

        if (hours == 24) {
            hours = 0;
        }
    }

    public void addOneMinute() {
        minutes += 1;

        if (minutes == 60) {
            minutes = 0;
        }
    }

    public void addOneAlarmHour() {
        alarmHours += 1;

        if (alarmHours == 24) {
            alarmHours = 0;
        }
    }

    public void addOneAlarmMinute() {
        alarmMinutes += 1;

        if (alarmMinutes == 60) {
            alarmMinutes = 0;
        }
    }

    public void changeAlarmStatus() {
        this.isAlarmOn = !isAlarmOn;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void clickMode() {
        state.clickMode();
    }

    public void longClickMode() {
        state.longClickMode();
    }

    public void clickH() {
        state.clickH();
    }

    public void clickM() {
        state.clickM();
    }

    public void tick() {
        state.tick();
    }
}
