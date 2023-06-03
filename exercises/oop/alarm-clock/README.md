Imagine an alarm clock.

Let it have three buttons. ```H``` is the button to increment the hour by one, ```M``` is the button to increment
the minute by one and the ```Mode``` button, which switches the clock to alarm setting mode. In this mode, the alarm
time is displayed and the ```H``` and ```M``` buttons set the alarm time rather than the current time. Pressing the
```Mode``` button again returns the watch to normal mode. Alternatively, a long press on the ```Mode``` button activates
the alarm. Pressing the same button again deactivates the alarm.

Then, if the alarm clock is active and the current time coincides with the alarm time, the bell starts ringing,
which is switched off either by pressing the ```Mode``` button or spontaneously after one minute. The ```H``` and
```M``` buttons are inactive during the ringing phase (when the alarm is activated).

The behaviour of the alarm clock is already complex, as the same inputs (pressing the same buttons) initiate different
actions depending on the mode.

In software and hardware computing systems, entities with complex behaviour are very common. Control devices,
network protocols, dialog boxes, computer game characters, and many other objects and systems have this property.

Let's summarise. We have the following actions:

- Setting the time
- Set the alarm time
- Setting the alarm clock on/off
- Turning the alarm clock off

When using buttons ```H``` and ```M``` the hours and minutes change independently and do not affect each other
in any way (as in most real alarms). That is, if there is an increase in the minutes from 59 to 60 (resetting to 00),
the number with the clock remains unchanged.

The interface methods of the clock are:

- ```clickMode()``` - pressing the ```Mode``` button
- ```longClickMode()``` - long pressing of the ```Mode``` button
- ```clickH()``` - pressing of the ```H``` button
- ```clickM()``` - pressing of ```M``` button
- ```tick()``` - when invoked, increases time by one minute. If the new time coincides with the alarm clock time,
the clock is switched to the alarm clock (bell) mode.

The methods above do not return anything.

- ```isAlarmOn()``` - shows if alarm clock is on. Returns logical value
- ```isAlarmTime()``` - returns ```true```, if clock time is the same as alarm clock time, otherwise ```false```
- ```getMinutes()``` - returns the minutes set on the clock
- ```getHours()``` - returns the hours set on the clock
- ```getAlarmMinutes()``` - returns the minutes set on the alarm clock
- ```getAlarmHours()``` - returns clock set on the alarm
- ```getCurrentMode()``` - returns current mode (String "alarm" or "clock" or "bell")

Implement the clock logic, also implement the State interface and state logic.