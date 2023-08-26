
package lk.sami.waterlevel.main;

import lk.sami.waterlevel.controller.WaterLevelController;
import lk.sami.waterlevel.view.AlarmForm;
import lk.sami.waterlevel.view.MainWindow;
import lk.sami.waterlevel.view.MessageForm;

public class AppInitializer {
    public static void main(String[] args) {
        WaterLevelController waterLevelController = new WaterLevelController();
        waterLevelController.setAlarmForm(new AlarmForm());
        waterLevelController.setMessageForm(new MessageForm());
        
        MainWindow mainWindow = new MainWindow();
        mainWindow.setWaterLevelController(waterLevelController);
        mainWindow.setVisible(true);
    }
}
