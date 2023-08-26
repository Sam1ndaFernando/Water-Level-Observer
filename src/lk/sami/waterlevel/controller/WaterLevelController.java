
package lk.sami.waterlevel.controller;

import lk.sami.waterlevel.view.AlarmForm;
import lk.sami.waterlevel.view.MessageForm;

public class WaterLevelController {
    private AlarmForm alarmForm;
    private MessageForm messageForm;

    public AlarmForm getAlarmForm() {
        return alarmForm;
    }

    public void setAlarmForm(AlarmForm alarmForm) {
        this.alarmForm = alarmForm;
    }

    public MessageForm getMessageForm() {
        return messageForm;
    }

    public void setMessageForm(MessageForm messageForm) {
        this.messageForm = messageForm;
    }
}
