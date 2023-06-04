package exercise;

import exercise.states.ClockState;
import exercise.states.State;

public class AlarmClock {

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

    public void tick() {
        this.minutes++;
    }
}
